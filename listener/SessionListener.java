package com.dana.pig.demopractice.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * ClassName: SessionListener
 * Description: 会话监听器
 * date: 2020/10/30 16:49
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@WebListener
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    /**
     * 浏览器关闭时会触发
     * @param se
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
