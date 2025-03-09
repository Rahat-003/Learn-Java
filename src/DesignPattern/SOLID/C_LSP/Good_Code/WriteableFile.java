package DesignPattern.SOLID.C_LSP.Good_Code;

public class WriteableFile extends ReadableFile implements Writeable{

    @Override
    public void write() {
        System.out.println("Writing to a file..");
    }
}
