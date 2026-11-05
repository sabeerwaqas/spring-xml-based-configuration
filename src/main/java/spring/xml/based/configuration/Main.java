package spring.xml.based.configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.xml.based.configuration.services.OrderService;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("beans.xml")) {
            OrderService orderService = context.getBean("orderService", OrderService.class);
            orderService.placeOrder(250.00);
        }
    }
}
