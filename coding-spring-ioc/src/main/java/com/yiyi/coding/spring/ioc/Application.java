package com.yiyi.coding.spring.ioc;
import com.yiyi.coding.spring.ioc.config.MyConfig;
import com.yiyi.coding.spring.ioc.service.OrderService;
import com.yiyi.coding.spring.ioc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Map;

public class Application {
    static void main() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(MyConfig.class);
        applicationContext.refresh();
        UserService userService = applicationContext.getBean(UserService.class);
        userService.test();

        for( Map.Entry<String,OrderService> entry : applicationContext.getBeansOfType(OrderService.class).entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
