package org.example;

import javax.swing.*;
import java.awt.*;

public class Lesson_5 {
    public static void main(String[] args) {
        class Calculator {
            final int height = 360;
            final int width = 540;
            final JFrame frame = new JFrame();
            final String[] buttonValues = {
                    "AC", "+/-", "%", "÷",
                    "7", "8", "9", "×",
                    "4", "5", "6", "-",
                    "1", "2", "3", "+",
                    "0", ".", "√", "="
            };
            final String[] rightSymbols = {"÷", "×", "-", "+", "="};
            final String[] topSymbols = {"AC", "+/-", "%"};

            Calculator() {
                frame.setVisible(true);
                frame.setSize(height, width);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
            }
        }
        Calculator calculator = new Calculator();
    }
}
