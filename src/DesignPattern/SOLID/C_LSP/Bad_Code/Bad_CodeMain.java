package DesignPattern.SOLID.C_LSP.Bad_Code;

public class Bad_CodeMain {
    public static void main(String[] args) {

        File file = new ReadOnlyFile();

        file.read();
        file.write();
    }

}
