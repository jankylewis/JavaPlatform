package creationalPattern.factoryPattern.sample1.paymentFactory;

import creationalPattern.factoryPattern.sample1.payment.PayPalPayment;
import creationalPattern.factoryPattern.sample1.paymentAbstract.APaymentFactory;
import creationalPattern.factoryPattern.sample1.paymentAbstract.IPayment;

public class PayPalPaymentFactory extends APaymentFactory {

    @Override
    public IPayment createPayment() {
        return new PayPalPayment();
    }
}
