/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package x.springboot.dubbo.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import x.springboot.dubbo.api.model.Response;
import x.springboot.dubbo.api.model.User;
import x.springboot.dubbo.api.service.DubboService;

/**
 * @Author : panxin
 * Date  : 2016-07-15
 */
@Slf4j
@RestController
public class DubboExample {

    @Autowired(required = false)
    private DubboService dubboService;

    // just Get
    @GetMapping("/api/example/login")
    public User login(@RequestParam(value = "username", required = false, defaultValue = "springboot") String username,
                      @RequestParam(value = "password", required = false, defaultValue = "dubbo") String password) {
        Response<User> resp = dubboService.mockLogin(username, password);
        if (!resp.isSuccess()) {
            log.error("failed to login by username = {}, password = {}, cause : {}", username, password, resp.getError());
            throw new RuntimeException(resp.getError());
        }
        return resp.getResult();
    }

}
