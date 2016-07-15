/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package com.example.springboot.dubbo.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Author  : panxin
 * Date    : 3:54 PM 7/15/16
 * Mail    : panxin@terminus.io
 */
@Configuration
@ImportResource("classpath:spring/dubbo-consumer.xml")
public class DubboConsumerAutoConfiguration {
}
