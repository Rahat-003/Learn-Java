package DesignPattern.SOLID.B_OCP;

import DesignPattern.SOLID.B_OCP.Good_Code.CreditCard;
import DesignPattern.SOLID.B_OCP.Good_Code.PaymentMethod;
import DesignPattern.SOLID.B_OCP.Good_Code.PaymentProcessor;

public class OCP_Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();

        processor.processPayment(creditCard, 100);
    }
}
