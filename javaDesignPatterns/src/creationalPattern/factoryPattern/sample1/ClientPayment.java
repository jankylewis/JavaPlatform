package creationalPattern.factoryPattern.sample1;

import creationalPattern.factoryPattern.sample1.paymentAbstract.APaymentFactory;
import creationalPattern.factoryPattern.sample1.paymentAbstract.IPayment;
import creationalPattern.factoryPattern.sample1.paymentFactory.CreditCardPaymentFactory;
import creationalPattern.factoryPattern.sample1.paymentFactory.CryptoPaymentFactory;
import creationalPattern.factoryPattern.sample1.paymentFactory.PayPalPaymentFactory;

import java.util.Scanner;

public class ClientPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select payment method by inputting 1/ 2/ 3:     ");
        System.out.println("1: Credit Card      ");
        System.out.println("2: PayPal       ");
        System.out.println("3: Crypto       ");

        System.out.print("Your choice: ");
        int userChoice = sc.nextInt();

        APaymentFactory paymentFactory = null;
        IPayment payment = null;

        paymentFactory = switch (userChoice) {
            case 1 -> new CreditCardPaymentFactory();
            case 2 -> new PayPalPaymentFactory();
            case 3 -> new CryptoPaymentFactory();
            default -> throw new RuntimeException("Your choice was invalid!        ");
        };

        payment = paymentFactory.createPayment();

        System.out.print("Enter your amount to pay: ");
        double amount = sc.nextDouble();

        //Process the payment
        payment.processPayment(amount);
    }
}
