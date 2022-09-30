package com.calculadora.menu;

public class MenuMain extends IMenu{

    @Override
    public void callMenu() {
        System.out.println("\n========= CALCULADORA =======\n");

        System.out.println("[1] ======== PADRÃO =========");
        System.out.println("[2] ========= IMC ===========");
        System.out.println("[3] ========= ÁREA ==========");
        System.out.println("[4] ========= SAIR ==========");

        System.out.print("\nSelecione a opção desejada: ");
    }
}
