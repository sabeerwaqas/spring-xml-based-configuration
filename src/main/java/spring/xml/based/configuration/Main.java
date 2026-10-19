package spring.xml.based.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.xml.based.configuration.services.PaymentService;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
    }
}
