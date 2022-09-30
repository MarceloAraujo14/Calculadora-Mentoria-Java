package com.calculadora.constants;

public enum MenuConstants {
    OPTION_ERROR("Selecione uma opção válida.");

    private final String value;

    MenuConstants(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
