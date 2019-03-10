package x.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import x.springboot.dubbo.api.model.Response;
import x.springboot.dubbo.api.model.User;
import x.springboot.dubbo.api.service.DubboService;

/**
 * @author panxin
 */
@Slf4j
@RestController
public class DubboStarterExample {

    @Reference
    private DubboService dubboService;

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
