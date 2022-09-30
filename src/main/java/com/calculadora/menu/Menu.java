package com.calculadora.menu;

import com.calculadora.calculadora.CalculadoraArea;
import com.calculadora.calculadora.CalculadoraIMC;
import com.calculadora.calculadora.CalculadoraPadrao;

import static com.calculadora.util.ReadUtil.readOption;

public class Menu {
    IMenu activeMenu;

    public void run() {
        int option = 0;
        while (option != 4){
            activeMenu = new MenuMain();
            activeMenu.callMenu();
            option = readOption();
            switch (option) {
                case (1) -> {
                    activeMenu = new MenuPadrao();
                    activeMenu.setCalculadora(new CalculadoraPadrao());
                    activeMenu.callMenu();
                }
                case (2) -> {
                    activeMenu = new MenuIMC();
                    activeMenu.setCalculadora(new CalculadoraIMC());
                    activeMenu.callMenu();
                }
                case (3) -> {
                    activeMenu = new MenuArea();
                    activeMenu.setCalculadora(new CalculadoraArea());
                    activeMenu.callMenu();
                }
                case (4) -> System.out.println("Obrigado por utilizar a\nnossa solução matemática!");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

}
