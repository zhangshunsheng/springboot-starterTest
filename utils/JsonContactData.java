package com.dana.pig.demopractice.utils;

/**
 * ClassName: HttpStatusCode
 * Description: 前端交互包装类
 * date: 2020/10/29 14:11
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
public class JsonContactData {
    private int code;
    private Object data;
    private String msg;

    public JsonContactData() {};

    public JsonContactData(final int code) {
        this.code = code;
    };

    public JsonContactData(final int code, final Object data) {
        this.code = code;
        this.data = data;
    };

    public JsonContactData(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    };

    public JsonContactData(final int code, final Object data, final String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    };

    public final static JsonContactData buildNormalSuccess(final Object data) {
        return new JsonContactData(HttpStatusConst.NORMAL_SUCCESS, data);
    }

    public final static JsonContactData buildNormalSuccess(final String msg) {
        return new JsonContactData(HttpStatusConst.NORMAL_SUCCESS, msg);
    }

    public final static JsonContactData buildNormalSuccess(final Object data, final String msg) {
        return new JsonContactData(HttpStatusConst.NORMAL_SUCCESS, data, msg);
    }

    public final static JsonContactData buildNormalFailure(final Object data) {
        return new JsonContactData(HttpStatusConst.NORMAL_FAILURE, data);
    }

    public final static JsonContactData buildNormalFailure(final String msg) {
        return new JsonContactData(HttpStatusConst.NORMAL_FAILURE, msg);
    }

    public final static JsonContactData buildNormalFailure(final Object data, final String msg) {
        return new JsonContactData(HttpStatusConst.NORMAL_FAILURE, data, msg);
    }

    public final static JsonContactData buildResult(final int code) {
        return new JsonContactData(code);
    }

    public final static JsonContactData buildResult(final int code, final Object data, final String msg) {
        return new JsonContactData(code, data, msg);
    }

    public final static JsonContactData buildResult(final int code, final Object data) {
        return new JsonContactData(code, data);
    }

    public final static JsonContactData buildResult(final int code, final String msg) {
        return new JsonContactData(code, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "JsonContactData{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
