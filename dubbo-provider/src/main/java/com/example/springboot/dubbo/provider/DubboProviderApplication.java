/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package com.example.springboot.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author  : panxin
 * Date    : 3:17 PM 7/15/16
 * Mail    : panxin@terminus.io
 */
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DubboProviderApplication.class);
        app.run(args);
    }

}
