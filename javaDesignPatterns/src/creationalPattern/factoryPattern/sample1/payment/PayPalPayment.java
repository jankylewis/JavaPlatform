package creationalPattern.factoryPattern.sample1.payment;

import creationalPattern.factoryPattern.sample1.paymentAbstract.IPayment;

public class PayPalPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing your PayPal transaction with the amount " + amount);
    }
}
