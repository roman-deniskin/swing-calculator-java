package com.calculator;

import javax.swing.*;
import javax.tools.Tool;
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

    public App() {
        Expression expr = new Expression();

        String[] fonts = {"-apple-system,BlinkMacSystemFont","Roboto","Helvetica Neue","Geneva","Noto Sans Armenian","Noto Sans Bengali","Noto Sans Cherokee","Noto Sans Devanagari","Noto Sans Ethiopic","Noto Sans Georgian","Noto Sans Hebrew","Noto Sans Kannada","Noto Sans Khmer","Noto Sans Lao","Noto Sans Osmanya","Noto Sans Tamil","Noto Sans Telugu","Noto Sans Thai","sans-serif","arial","Tahoma","verdana"};
        for (String font: fonts) {
            if(App.isFontExists(font)) {
                JDisplayFieldTextArea.setFont(new Font(font, Font.PLAIN, 14));
                break;
            }
        }

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
        JBtnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('%');
                JDisplayFieldTextArea.append("%");
            }
        });
        JBtnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDisplayFieldTextArea.setText("");
                double arg = Double.parseDouble(expr.toString());
                double result = ProcessCalc.sqrt(arg);
                JDisplayFieldTextArea.append(String.valueOf(result));
            }
        });
        JBtnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.clearExpression();
                JDisplayFieldTextArea.setText("");
            }
        });
        JBtnDevision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('/');
                JDisplayFieldTextArea.append("/");
            }
        });
        JBtnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('*');
                JDisplayFieldTextArea.append("*");
            }
        });
        JBtnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('-');
                JDisplayFieldTextArea.append("-");
            }
        });
        JBtnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('+');
                JDisplayFieldTextArea.append("+");
            }
        });
        JBtnChangeSign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.changeSign();
                JDisplayFieldTextArea.setText(expr.toString());
            }
        });
        JBtnPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                expr.addChar('.');
                JDisplayFieldTextArea.setText(".");
            }
        });
        JBtnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setResizable(false);
        frame.setContentPane(new App().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width/2+150, dimension.height/2+150, 300, 300);
        frame.pack();
        frame.setVisible(true);
    }

    public static boolean isFontExists(String font) {
        GraphicsEnvironment g= null;
        g=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String []fonts=g.getAvailableFontFamilyNames();
        for (int i = 0; i < fonts.length; i++) {
            if(fonts[i].equals(font)){
                return true;
            }
        }
        return false;
    }
}
