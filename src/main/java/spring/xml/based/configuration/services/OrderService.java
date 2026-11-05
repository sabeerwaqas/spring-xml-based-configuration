package spring.xml.based.configuration.services;

public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order...");
        paymentService.pay(amount);
    }
}
