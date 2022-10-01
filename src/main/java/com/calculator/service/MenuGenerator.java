package com.calculator.service;


import com.calculator.entity.mathoperations.MathOperation;

import java.util.List;

public class MenuGenerator {

    private MenuGenerator(){}

    public static String generateHeader(String title){
        StringBuilder sb = new StringBuilder();
        sb.append("=".repeat(Math.max(0, (30 - title.length()) / 2)));
        return String.format("%s %s %s%n", sb, title, sb);
    }

    public static String generateOptions(List<MathOperation> operations){
        int back = 0;
        String backName = " BACK";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operations.size(); i++) {
            sb.append("[").append(i).append("] ");
            sb.append("=".repeat(Math.max(0, (27 - operations.get(i).getName().length()))));
            sb.append(" ").append(operations.get(i).getName()).append("\n");
            back++;
        }
        sb.append("[").append(back).append("] ").append("=".repeat(Math.max(0,(28 - backName.length())))).append(backName);
        return sb.toString();

    }

}
