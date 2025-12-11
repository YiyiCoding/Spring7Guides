package com.yiyi.coding.spring.ioc.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean implements InitializingBean, DisposableBean {

    // 步骤1：实例化（无代码，容器自动执行）
    public LifecycleBean() {
        System.out.println("【1. 实例化】创建Bean实例");
    }

    // 步骤2：属性填充（模拟注入，实际可通过配置注入）
    private String name;
    public void setName(String name) {
        this.name = name;
        System.out.println("【2. 属性填充】设置属性name=" + name);
    }

    // 步骤3：BeanPostProcessor前置处理（需自定义实现）
    // 步骤4：初始化
    @PostConstruct
    public void postConstruct() {
        System.out.println("【4.1 初始化】@PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【4.2 初始化】InitializingBean#afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("【4.3 初始化】自定义init-method");
    }

    // 步骤5：BeanPostProcessor后置处理（需自定义实现）
    // 步骤6：就绪（可用）
    public void doBusiness() {
        System.out.println("【6. 就绪】Bean执行业务逻辑");
    }

    // 步骤7：销毁前处理（需自定义DestructionAwareBeanPostProcessor）
    // 步骤8：销毁
    @PreDestroy
    public void preDestroy() {
        System.out.println("【8.1 销毁】@PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("【8.2 销毁】DisposableBean#destroy");
    }

    public void destroyMethod() {
        System.out.println("【8.3 销毁】自定义destroy-method");
    }
}