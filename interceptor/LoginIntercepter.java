package com.dana.pig.demopractice.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: LoginIntercepter
 * Description: 自定义拦截器
 * date: 2020/10/30 17:00
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("登陆拦截器进入======preHandle");
        return HandlerInterceptor.super.preHandle(request,response,handler);
    }

    /**
     * 实现拦截的业务流程
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("登陆拦截器处理======postHandle");
    }

    /**
     * 无论是否异常都会执行此方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("登陆拦截器完成======afterCompletion");
    }
}
