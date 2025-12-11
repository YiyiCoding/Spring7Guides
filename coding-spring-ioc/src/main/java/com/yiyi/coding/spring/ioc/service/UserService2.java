package com.yiyi.coding.spring.ioc.service;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {
    private final OrderService orderService;

    public UserService2(OrderService orderService) {
        this.orderService = orderService;
    }
    public void test(){
        System.out.println(orderService.demo());
    }
}
