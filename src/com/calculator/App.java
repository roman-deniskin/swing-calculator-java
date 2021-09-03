package com.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private javax.swing.JPanel JPanel;
    private JButton JBtn1;
    private JButton JBtn2;
    private JButton JBtn3;
    private JButton JBtn4;
    private JButton JBtn5;
    private JButton JBtn6;
    private JButton JBtn7;
    private JButton JBtn8;
    private JButton JBtn9;
    private JButton JBtnPercent;
    private JButton JBtnSqrt;
    private JButton JBtnC;
    private JButton JBtnDevision;
    private JButton JBtnMultiply;
    private JButton JBtnMinus;
    private JButton JBtnPlus;
    private JButton JBtnChangeSign;
    private JButton JBtn0;
    private JButton JBtnPoint;
    private JButton JBtnEqual;
    public JPanel JDisplayField;
    private JTextArea JDisplayFieldTextArea;
    private JMenuBar jMainMenuBar;
    private Expression expr = new Expression();

    public App() {
        JDisplayFieldTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('1');
                JDisplayFieldTextArea.append("1");
            }
        });
        JBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('2');
                JDisplayFieldTextArea.append("2");
            }
        });
        JBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('3');
                JDisplayFieldTextArea.append("3");
            }
        });
        JBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('4');
                JDisplayFieldTextArea.append("4");
            }
        });
        JBtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('5');
                JDisplayFieldTextArea.append("5");
            }
        });
        JBtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('6');
                JDisplayFieldTextArea.append("6");
            }
        });
        JBtn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('7');
                JDisplayFieldTextArea.append("7");
            }
        });
        JBtn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('8');
                JDisplayFieldTextArea.append("8");
            }
        });
        JBtn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('9');
                JDisplayFieldTextArea.append("9");
            }
        });
        JBtn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('0');
                JDisplayFieldTextArea.append("0");
            }
        });
        JBtnDevision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('/');
                JDisplayFieldTextArea.append("/");
            }
        });
        JBtnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('%');
                JDisplayFieldTextArea.append("%");
            }
        });
        JBtnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDisplayFieldTextArea.setText("");
                double result = ProcessCalc.sqrt(Double.valueOf(expr.toString()));
                JDisplayFieldTextArea.append(String.valueOf(result));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setResizable(false);
        frame.setContentPane(new App().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
