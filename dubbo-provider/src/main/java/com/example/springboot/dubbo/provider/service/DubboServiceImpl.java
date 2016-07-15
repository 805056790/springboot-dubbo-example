/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package com.example.springboot.dubbo.provider.service;

import com.example.springboot.dubbo.model.Response;
import com.example.springboot.dubbo.model.User;
import com.example.springboot.dubbo.service.DubboService;
import com.google.common.base.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Author  : panxin
 * Date    : 3:22 PM 7/15/16
 * Mail    : panxin@terminus.io
 */
@Slf4j
@Service
public class DubboServiceImpl implements DubboService {

    @Override
    public Response<User> mockLogin(String userName, String password) {
        if (Objects.equal("springboot", userName) && Objects.equal("dubbo", password)) {
            User user = new User();
            user.setId(1L);
            user.setUserName(userName);
            user.setPassword(password);
            user.setBirthday(new Date());
            return Response.ok(user);
        }
        return Response.failed("user.login.failed");
    }
}
