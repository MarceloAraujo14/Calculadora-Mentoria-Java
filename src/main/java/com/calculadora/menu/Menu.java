package com.calculadora.menu;

import com.calculadora.calculadora.Calculadora;

public abstract class Menu {

    Calculadora calculadora;

    abstract String execute();

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
