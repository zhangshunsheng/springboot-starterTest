package com.dana.pig.demopractice.utils;

/**
 * ClassName: HttpStatusCode
 * Description: http状态码常量类
 * date: 2020/10/29 14:11
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
public final class HttpStatusConst {
    private HttpStatusConst() {};
    // 接口调用成功状态码
    public static final int NORMAL_SUCCESS = 200;
    // 接口调用失败状态码
    public static final int NORMAL_FAILURE = -200;
    // 接口调用失败状态码
    public static final int LOGIN_FAILURE = -200;
}
