package com.engeto.lekce02;

public enum TypeOfStay {

    WORK("pracovní"), HOLIDAY("rekreační");

    String description;

    TypeOfStay(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return description;
    }
}
