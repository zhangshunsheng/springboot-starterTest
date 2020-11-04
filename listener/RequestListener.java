package com.dana.pig.demopractice.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * ClassName: RequestListener
 * Description: 请求监听器（日志打印）
 * date: 2020/10/30 16:50
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

    }
}
