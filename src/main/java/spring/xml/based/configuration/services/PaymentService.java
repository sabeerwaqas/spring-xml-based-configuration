package spring.xml.based.configuration.services;

public class PaymentService {

    public PaymentService() {
             System.out.println("PaymentService constructor called");
    }

    public void pay(double amount) {
        System.out.println("Refunding payment of amount: " + amount);
    }

}