package DesignPattern.SOLID.D_ISP.Good_Code;

import DesignPattern.SOLID.D_ISP.Bad_Code.Document;

public class SimplePrinter implements Printer{

    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}
