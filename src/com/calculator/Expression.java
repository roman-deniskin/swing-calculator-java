package com.calculator;

import javax.swing.*;

public class Expression {
    private String textExpression = "";
    public Double[] args = {null, null};
    public char operation;

    /**
     * Парсинг введённого значения
     * @param String expr
     * @return String
     */
    public void parse(String expr) {
        int i = 0;
        for (String val: expr.split("((?<=[\\+|\\*|\\-|/])|(?=[\\+|\\*|\\-|/]))")) {
            System.out.println(val.toString());
            if (!val.equals("")) {
                if (this.findOperation(val.toCharArray()[0]) != ' ') {
                    this.operation = this.findOperation(val.toCharArray()[0]);
                } else {
                    this.args[i] = Double.valueOf(val);
                }
            }
            i++;
        }
        if (i > 1) {
            JOptionPane.showMessageDialog(null,"Ошибка ввода. Калькулятор поддерживает только 2 аргумента.");
        }
    }

    /**
     * Поиск простой операции
     * @param sign
     * @return
     */
    public char findOperation(char sign) {
        switch (sign) {
            case '+':
            case '-':
            case '*':
            case '/':
            default:
                sign = ' ';
        }
        return sign;
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
