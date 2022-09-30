package com.calculadora.menu;

import com.calculadora.calculadora.Calculadora;

public abstract class IMenu {

    Calculadora calculadora;

    abstract void callMenu();

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
