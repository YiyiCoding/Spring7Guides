package com.yiyi.coding.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component
@Service
public class UserService {

    @Autowired
    private OrderService orderService;

    public void test(){
        System.out.println(orderService.demo());
    }
}
