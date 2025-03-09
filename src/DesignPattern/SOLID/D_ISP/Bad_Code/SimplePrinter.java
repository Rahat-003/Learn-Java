package DesignPattern.SOLID.D_ISP.Bad_Code;


// Simple printer only prints document
public class SimplePrinter implements Machine{

    @Override
    public void print(Document doc) {
        System.out.println("Printing document from SimplePrinter");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Copy not supported");
    }
}
