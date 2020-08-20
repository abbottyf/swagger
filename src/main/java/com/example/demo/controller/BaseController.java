package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author ZhangBin
 * @Date 2020/5/21 12:29
 * @Version 1.0
 */
public abstract class BaseController {
    @Autowired
    protected HttpServletRequest request;

    protected String getToken() {
        String networkType = request.getHeader("token");
        return networkType;
    }

}
