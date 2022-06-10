package Chapter4;

import javax.swing.*;

public class InterfacePractice implements IInt{
    public static void main(String[] args) {
        InterfacePractice interfacePractice = new InterfacePractice();
        int j = interfacePractice.theValue;
        int k = IInt.theValue;
        int l = theValue;
        System.out.println(j);
    }
}

