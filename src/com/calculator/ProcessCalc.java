package com.calculator;

import javax.swing.*;

public class ProcessCalc {

    public double sqrt(double num) {
        try {
            if (num <= 0) {
                throw new NumberFormatException("Квадратный корень должен быть больше 0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return Math.sqrt(num);
    }

    /**
     * Обработка простых операций +,-,*,/
     * @return
     */
    public Double simpleOperation(Expression expr) {
        double result = Double.NaN;
        switch (expr.operation) {
            case '+':
                result = expr.args[0] + expr.args[1];
            case '-':
                result = expr.args[0] - expr.args[1];
            case '*':
                result = expr.args[0] * expr.args[1];
            case '/':
                result = expr.args[0] / expr.args[1];
        }
        return result;
    }
}
