/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package com.example.springboot.dubbo.consumer.controller;

import com.example.springboot.dubbo.model.Response;
import com.example.springboot.dubbo.model.User;
import com.example.springboot.dubbo.service.DubboService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : panxin
 * Date  : 2016-07-15
 */
@Slf4j
@RestController
public class DubboExample {

    private DubboService dubboService;

    @Autowired
    public DubboExample(DubboService dubboService) {
        this.dubboService = dubboService;
    }

    /**
     * mock login by method GET
     *
     * @return user info
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestParam(value = "userName") String userName,
                      @RequestParam(value = "password") String password) {
        Response<User> resp = dubboService.mockLogin(userName, password);
        if (!resp.isSuccess()) {
            log.error("failed to login by userName = {}, password = {}, cause : {}", userName, password, resp.getError());
            throw new RuntimeException(resp.getError());
        }
        return resp.getResult();
    }

}
