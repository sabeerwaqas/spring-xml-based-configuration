package spring.xml.based.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.xml.based.configuration.services.OrderService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {

    @Test
    void loadsOrderServiceWithXmlConfiguration() {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("beans.xml")) {
            OrderService orderService = context.getBean("orderService", OrderService.class);

            assertNotNull(orderService);
        }
    }
}
