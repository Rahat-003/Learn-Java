package DesignPattern.SOLID.C_LSP.Good_Code;

import DesignPattern.SOLID.C_LSP.Bad_Code.File;




public class Good_CodeMain {

    public static void readAnyFile(ReadableFile file) {
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
//        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
//        writeableFile.read();
//        writeableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writeableFile);

    }

}
