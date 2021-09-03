package com.calculator;

public class Expression {
    private String textExpression = "";

    public void addChar(char newChar) {
        textExpression += newChar;
    }

    public void clearExpression() {
        textExpression = "";
    }

    public String toString() {
        return this.textExpression;
    }
}
