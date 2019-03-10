/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package x.springboot.dubbo.api.service;


import x.springboot.dubbo.api.model.Response;
import x.springboot.dubbo.api.model.User;

/**
 * @Author panxin
 * @Date 2016-07-15
 */
public interface DubboService {

    /**
     * mock user login
     *
     * @param username username
     * @param password pwd
     * @return user info
     */
    Response<User> mockLogin(String username, String password);

}
