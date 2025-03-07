package DesignPattern.SOLID.A_SRP.Good_Code;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed " + amount);
    }
}
