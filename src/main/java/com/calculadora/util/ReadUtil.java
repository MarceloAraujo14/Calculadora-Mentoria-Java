package com.calculadora.util;

import java.util.Scanner;

public class ReadUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readOption(){
        try {
            return Integer.parseInt(String.valueOf(scanner.next().charAt(0)));
        }catch (Exception e){
            scanner.next();
            return 0;
        }
    }

    public static double readValue(){
        try {
            return scanner.nextDouble();
        }
        catch (Exception e){
            System.out.print("Selecione um valor válido:");
            scanner.next();
            return readValue();
        }
    }
}
