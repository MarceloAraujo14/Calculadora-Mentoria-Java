package com.calculator.utils;

import java.util.Scanner;

public class CalculatorUtils {

    private CalculatorUtils(){}

    private static final Scanner scanner = new Scanner(System.in);

    public static double readValue(){
        try {
            return scanner.nextDouble();
        }catch (Exception e){
            System.out.print("Insert a valid value: ");
            scanner.next();
            return readValue();
        }
    }

    public static int readOption(){
        try {
            return scanner.nextInt();
        }catch (Exception e){
            System.out.print("Select a valid option: ");
            scanner.next();
            return readOption();
        }
    }

    public static void readClose(){
        scanner.close();
    }

}
