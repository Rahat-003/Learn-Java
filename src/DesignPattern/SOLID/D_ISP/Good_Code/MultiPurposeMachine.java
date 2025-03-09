package DesignPattern.SOLID.D_ISP.Good_Code;

import DesignPattern.SOLID.D_ISP.Bad_Code.Document;

public class MultiPurposeMachine implements Printer,Scanner,Copier{
    @Override
    public void copy(Document doc) {
        System.out.println("Copying Document..");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing Document..");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning Document..");
    }
}
