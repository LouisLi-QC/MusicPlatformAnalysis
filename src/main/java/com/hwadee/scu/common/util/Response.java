package com.hwadee.scu.common.util;

import lombok.Data;

/**
 * @program: musicPlatform
 * @description: 将结果封装返回
 * @author: fanyang
 * @create: 2021-06-13 14:23
 **/
@Data
public class Response {
    // 是否成功
    private Boolean flag;
    // 返回信息
    private String message;
    // 返回数据
    private Object data;

    public Response() {}

    /**
     * 增删改使用
     */
    public Response(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    /**
     * 查询使用
     */
    public Response(Boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
