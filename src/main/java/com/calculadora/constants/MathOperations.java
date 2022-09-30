package com.calculadora.constants;

public enum MathOperations {
    SOMA("soma"),
    SUBTRACAO("subtração"),
    DIVISAO("divisão"),
    MULTIPLICACAO("multiplicação"),
    POTENCIACAO("potenciação"),
    AREA_CIRCULO("circulo"),
    AREA_RETANGULO("retângulo"),
    AREA_QUADRADO("quadrado"),
    IMC("IMC");

    private final String name;

    MathOperations(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
