package spring.xml.based.configuration.services;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService constructor called");
        System.out.println("PaymentService injected into OrderService: " + paymentService);
    }
}