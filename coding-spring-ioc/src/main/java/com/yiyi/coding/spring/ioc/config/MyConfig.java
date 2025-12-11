package com.yiyi.coding.spring.ioc.config;

import com.yiyi.coding.spring.ioc.service.OrderService;
import com.yiyi.coding.spring.ioc.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan("com.yiyi.coding.spring.ioc")
@Configuration
@Import(UserService.class)
public class MyConfig {

    @Bean
    public OrderService orderService(){
        return new OrderService();
    }
}
