package DesignPattern.SOLID.B_OCP.Good_Code;


public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        // business logic, long code may appear here
        System.out.println("Making payments via Dedit card: " + amount);
    }
}
