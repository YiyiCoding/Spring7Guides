package com.yiyi.coding.spring.ioc;// 测试类
import com.yiyi.coding.spring.ioc.bean.LifecycleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.yiyi.coding.spring.ioc")
public class LifecycleTest {
    static void main() {
        // 启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifecycleTest.class);
        LifecycleBean bean = context.getBean(LifecycleBean.class);
        bean.setName("test"); // 手动触发属性填充（模拟容器注入）
        bean.doBusiness();
        // 关闭容器（触发销毁）
        context.close();
    }
}