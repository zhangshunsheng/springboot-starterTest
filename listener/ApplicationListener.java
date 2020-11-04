package com.dana.pig.demopractice.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ClassName: ApplicationListener
 * Description: 应用上下文监听器（垃圾清理，资源初始化加载，建立相关连接）
 * date: 2020/10/30 16:46
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    /**
     * 上下文启动
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("应用上下文监听器=====启动");
    }

    /**
     *  上下文销毁
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("应用上下文监听器=====摧毁");
    }
}
