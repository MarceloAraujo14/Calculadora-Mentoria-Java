package com.calculadora.util;

import java.util.Scanner;

public class ReadUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readOption(){
        try {
            return scanner.nextInt();
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
