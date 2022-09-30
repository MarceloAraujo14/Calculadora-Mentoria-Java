package com.calculadora.menu;

import com.calculadora.calculadora.CalculadoraArea;
import com.calculadora.calculadora.CalculadoraIMC;
import com.calculadora.calculadora.CalculadoraPadrao;

import static com.calculadora.util.ReadUtil.readOption;

public class MenuController {
    Menu activeMenu;
    int option = 0;

    public void run() {
        while (option != 4){
            activeMenu = new MenuMain();
            activeMenu.execute();
            option = readOption();
            switch (option) {
                case (1) -> {
                    activeMenu = new MenuPadrao();
                    activeMenu.setCalculadora(new CalculadoraPadrao());
                    System.out.println(activeMenu.execute());
                }
                case (2) -> {
                    activeMenu = new MenuIMC();
                    activeMenu.setCalculadora(new CalculadoraIMC());
                    System.out.println(activeMenu.execute());
                }
                case (3) -> {
                    activeMenu = new MenuArea();
                    activeMenu.setCalculadora(new CalculadoraArea());
                    System.out.println(activeMenu.execute());
                }
                case (4) -> System.out.println("Obrigado por utilizar a\nnossa solução matemática!");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

}
