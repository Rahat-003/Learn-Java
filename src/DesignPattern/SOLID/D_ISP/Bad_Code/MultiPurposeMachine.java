package DesignPattern.SOLID.D_ISP.Bad_Code;

public class MultiPurposeMachine implements Machine{

    @Override
    public void print(Document doc) {
        System.out.println("Printing Document from MultiPurposeMachine");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning Document from MultiPurposeMachine");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying Document from MultiPurposeMachine");
    }
}
