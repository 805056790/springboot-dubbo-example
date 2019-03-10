package x.springboot.dubbo.provider.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Objects;
import x.springboot.dubbo.api.model.Response;
import x.springboot.dubbo.api.model.User;
import x.springboot.dubbo.api.service.DubboService;

import java.util.Date;

/**
 * @author panxin
 */
@Service
public class DubboServiceImpl implements DubboService {

    @Override
    public Response<User> mockLogin(String username, String password) {
        if (Objects.equal("springboot", username) && Objects.equal("dubbo", password)) {
            User user = new User();
            user.setId(233L);
            user.setUsername(username);
            user.setPassword(password);
            user.setBirthday(new Date());
            return Response.ok(user);
        }
        return Response.failed("username.or.password.mismatch");
    }

}
