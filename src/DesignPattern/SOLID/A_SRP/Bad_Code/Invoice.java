package DesignPattern.SOLID.A_SRP.Bad_Code;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional functionality
    public void generateInvoice() {
        System.out.println("Invoice generated & printed " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification for invoice");
    }
}
