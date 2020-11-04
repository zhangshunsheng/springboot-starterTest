package com.dana.pig.demopractice.filter;

import com.dana.pig.demopractice.utils.HttpStatusConst;
import com.dana.pig.demopractice.utils.JsonContactData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.thymeleaf.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: LoginFilter
 * Description:
 * date: 2020/10/30 15:09
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
// 拦截所有私有路径
@WebFilter(urlPatterns = "/dana/v1/pri/*")
public class LoginFilter implements Filter {

    private static ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入LoginFilter ==== doFilter");
        // 转换request与response
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String token = req.getHeader("token");
        if(StringUtils.isEmpty(token)) {
            token = req.getParameter("token");
        }
        if(StringUtils.isEmpty(token)) {
            JsonContactData result = JsonContactData.buildResult(HttpStatusConst.LOGIN_FAILURE, "登录失败，token为空！");
            String jsonStr = objectMapper.writeValueAsString(result);
            renderResponse(resp, jsonStr);
        } else {
            chain.doFilter(req, resp);
        }

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("进入LoginFilter ==== init");
    }

    @Override
    public void destroy() {
        System.out.println("进入LoginFilter ==== destroy");
    }

    private void renderResponse(HttpServletResponse httpServletResponse, String json) {
        // 设置字符串编码
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        // try() {} :jdk 1.8自动资源管理特性，(中用于资源的申请，如果{}块中出现异常，则会自动关闭异常)
        try(PrintWriter p = httpServletResponse.getWriter()) {
            p.write(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
