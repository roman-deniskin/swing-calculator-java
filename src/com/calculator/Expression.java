package com.calculator;

import javax.swing.*;

public class Expression {
    private String textExpression = "";

    /**
     * Парсинг введённого значения
     * @param String expr
     * @return String
     */
    public String[] parse(String expr) {
        return expr.split("((?<=[\\+|\\*|\\-|/])|(?=[\\+|\\*|\\-|/]))");
    }

    public void addChar(char newChar) {
        textExpression += newChar;
    }

    public void clearExpression() {
        textExpression = "";
    }

    public String toString() {
        return this.textExpression;
    }

    public void changeSign() {
        try {
            double val = Double.parseDouble(this.textExpression);
            System.out.println(this.textExpression);
            System.out.println(val);
            if (val != 0 && val > 0) {
                this.textExpression = '-' + this.textExpression;
            } else if (val != 0 && val < 0) {
                this.textExpression = this.textExpression.substring(1);
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ошибка ввода. Изменить знак у выражения нельзя. Допустымы только числа");
        }
    }
}
