package com.dana.pig.demopractice.grobleExceptionHandle;

import com.dana.pig.demopractice.utils.JsonContactData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: CustomExtException
 * Description:
 * date: 2020/10/29 19:41
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@RestControllerAdvice // 异常返回json数据
//@ControllerAdvice // 异常返回页面数据
//@ResponseBody
public class CustomExtException {

    /**
     * 处理异常 返回json数据
     * @param e 接受的异常
     * @param httpServletRequest 请求信息，这样才能注入
     * @return
     */
    @ExceptionHandler(value = Exception.class) // 标记所处理的异常类型，这样异常进来的时候才能找寻合适的入口
    JsonContactData handlException(Exception e, HttpServletRequest httpServletRequest) {
        return JsonContactData.buildResult( -2, "服务端出问题了！");
    }

    /**
     * 处理异常 返回页面数据数据
     * @param e 接受的异常
     * @param httpServletRequest 请求信息，这样才能注入
     * @return
     */
//    @ExceptionHandler(value = Exception.class) // 标记所处理的异常类型，这样异常进来的时候才能找寻合适的入口
//    Object handlException(Exception e, HttpServletRequest httpServletRequest) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error.html");
//        return modelAndView;
//    }
}
