package DesignPattern.SOLID.B_OCP.Good_Code;

public class PaymentProcessor {
    /**
     * Runtime polymorphism here
     * PaymentMethod can be any of types like DebitCard, CreditCard, PayPal
     * or even another new payment method class can be added and be added
     */
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }

}
