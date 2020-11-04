package com.dana.pig.demopractice.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: WebMvcConfigurate
 * Description: 拦截器配置类
 * date: 2020/10/30 16:58
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@Configuration
public class WebMvcConfigurate implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 加入拦截器并配置拦截路径--先注册先拦截但是都会进入拦截器
//        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("");
        registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/dana/*/pri/**");
        // 注册拦截器
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public LoginIntercepter getLoginInterceptor() {
        return new LoginIntercepter();
    }
}
