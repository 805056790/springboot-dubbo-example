/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package x.springboot.dubbo.provider.api;

import x.springboot.dubbo.api.model.Response;
import x.springboot.dubbo.api.model.User;
import x.springboot.dubbo.api.service.DubboService;
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
    public Response<User> mockLogin(String username, String password) {
        if (Objects.equal("springboot", username) && Objects.equal("dubbo", password)) {
            User user = new User();
            user.setId(122L);
            user.setUsername(username);
            user.setPassword(password);
            user.setBirthday(new Date());
            return Response.ok(user);
        }
        return Response.failed("user.login.failed");
    }

}
