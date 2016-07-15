/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package com.example.springboot.dubbo.service;

import com.example.springboot.dubbo.model.Response;
import com.example.springboot.dubbo.model.User;

/**
 * @Author panxin
 * @Date 2016-07-15
 */
public interface DubboService {

    /**
     * mock user login
     *
     * @param userName username
     * @param password pwd
     * @return user info
     */
    Response<User> mockLogin(String userName, String password);

}
