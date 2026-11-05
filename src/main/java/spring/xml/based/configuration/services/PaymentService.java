package spring.xml.based.configuration.services;

public class PaymentService {

    public void pay(double amount) {
        System.out.printf("Processing payment of amount: %.2f%n", amount);
    }
}
