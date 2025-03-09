package DesignPattern.SOLID.C_LSP.Good_Code;

public class ReadableFile implements Readable{

    @Override
    public void read() {
        System.out.println("Reading from file");
    }
}
