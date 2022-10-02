package com.calculator.generator;


import com.calculator.model.mathoperations.MathOperation;

import java.util.List;

public class MenuGenerator {

    public static final String BACK = " BACK";

    private MenuGenerator(){}

    public static String buildHeaderWithTitle(String title){
        StringBuilder sb = new StringBuilder();
        sb.append("=".repeat(Math.max(0, (30 - title.length()) / 2)));
        return String.format("%s %s %s%n", sb, title, sb);
    }

    public static String buildMenuOptions(List<String> options){
        int back = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < options.size(); i++) {
            sb.append("[").append(i).append("] ");
            sb.append("=".repeat(Math.max(0, (27 - options.get(i).length()))));
            sb.append(" ").append(options.get(i).toUpperCase()).append("\n");
            back++;
        }
        sb.append("[").append(back).append("] ").append("=".repeat(Math.max(0,(28 - BACK.length())))).append(BACK);
        sb.append("\n");
        return sb.toString();
    }

    public static String buildOperationOptions(List<MathOperation> operations){
        int back = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operations.size(); i++) {
            sb.append("[").append(i).append("] ");
            sb.append("=".repeat(Math.max(0, (26 - operations.get(i).getName().length()))));
            sb.append(" ").append(operations.get(i).getName().toUpperCase()).append("\n");
            back++;
        }
        sb.append("[").append(back).append("] ").append("=".repeat(Math.max(0,(27 - BACK.length())))).append(BACK);
        sb.append("\n");
        return sb.toString();
    }



}
