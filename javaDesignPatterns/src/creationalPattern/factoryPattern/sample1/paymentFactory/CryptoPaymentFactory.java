package creationalPattern.factoryPattern.sample1.paymentFactory;

import creationalPattern.factoryPattern.sample1.payment.CryptoPayment;
import creationalPattern.factoryPattern.sample1.paymentAbstract.APaymentFactory;
import creationalPattern.factoryPattern.sample1.paymentAbstract.IPayment;

public class CryptoPaymentFactory extends APaymentFactory {

    @Override
    public IPayment createPayment() {
        return new CryptoPayment();
    }
}
