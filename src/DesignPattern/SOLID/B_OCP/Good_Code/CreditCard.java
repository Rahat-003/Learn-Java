package DesignPattern.SOLID.B_OCP.Good_Code;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        // business logic, long code may appear here
        System.out.println("Making payments via Credit card: " + amount);
    }
}
