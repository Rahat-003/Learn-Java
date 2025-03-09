package DesignPattern.SOLID.C_LSP;


import DesignPattern.SOLID.C_LSP.Bad_Code.Bad_CodeMain;
import DesignPattern.SOLID.C_LSP.Good_Code.Good_CodeMain;

public class LSP_Main {
    public static void main(String[] args) {
        /**
         * Objects of a superclass should be replaceable with objects of a subclass
         */
//        Bad_CodeMain.main(args);
        Good_CodeMain.main(args);
    }
}
