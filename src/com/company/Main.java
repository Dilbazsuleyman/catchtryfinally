package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            double result = a / b;

        }catch (ArithmeticException e) {
            System.out.println("check one more time");
        }  finally {

            System.out.println("finally called");
        }
    }
}
