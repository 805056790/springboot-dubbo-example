/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package x.springboot.dubbo.provider;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Author  : panxin
 * Date    : 3:18 PM 7/15/16
 * Mail    : panxin@terminus.io
 */
@ComponentScan
@Configuration
@ImportResource("classpath:spring/dubbo-provider.xml")
public class DubboProviderAutoConfiguration {

}
