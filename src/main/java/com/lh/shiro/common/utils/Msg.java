package com.lh.shiro.common.utils;

import java.util.List;

/**
 * Created by linghu on 17/04/17.
 */
public class Msg<T> {

    /* API调用结果 true:成功，false：失败 */
    private boolean success = false;
    /* 错误码 */
    private int code = 0;

    /* 返回的数据，可以任意集合或对象 */
    private T data;

    /* 结果说明 */
    private String msg = "编辑成功";

    private List<String> msgs;

    public void setResult(int result) {
        this.code = result;
    }

    /**
     * Getter for property 'success'.
     *
     * @return Value for property 'success'.
     */
    public boolean getSuccess() {
        return success;
    }

    /**
     * Setter for property 'success'.
     *
     * @param success Value to set for property 'success'.
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter for property 'code'.
     *
     * @return Value for property 'code'.
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter for property 'code'.
     *
     * @param code Value to set for property 'code'.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter for property 'data'.
     *
     * @return Value for property 'data'.
     */
    public T getData() {
        return data;
    }

    /**
     * Setter for property 'data'.
     *
     * @param data Value to set for property 'data'.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter for property 'msg'.
     *
     * @return Value for property 'msg'.
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter for property 'msg'.
     *
     * @param msg Value to set for property 'msg'.
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Getter for property 'msgs'.
     *
     * @return Value for property 'msgs'.
     */
    public List<String> getMsgs() {
        return msgs;
    }

    /**
     * Setter for property 'msgs'.
     *
     * @param msgs Value to set for property 'msgs'.
     */
    public void setMsgs(List<String> msgs) {
        this.msgs = msgs;
    }
}
