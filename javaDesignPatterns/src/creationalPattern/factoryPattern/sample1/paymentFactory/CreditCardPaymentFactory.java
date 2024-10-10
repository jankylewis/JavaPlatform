package creationalPattern.factoryPattern.sample1.paymentFactory;

import creationalPattern.factoryPattern.sample1.payment.CreditCardPayment;
import creationalPattern.factoryPattern.sample1.paymentAbstract.APaymentFactory;
import creationalPattern.factoryPattern.sample1.paymentAbstract.IPayment;

public class CreditCardPaymentFactory extends APaymentFactory {

    @Override
    public IPayment createPayment() {
        return new CreditCardPayment();
    }
}
