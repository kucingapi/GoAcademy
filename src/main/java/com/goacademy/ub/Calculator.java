package com.goacademy.ub;

import java.util.Scanner;

public class Calculator {
    double result = 0.0;

    public void add(double inputNumber){
        result += inputNumber;
    }

    public void subtract(double inputNumber){
        result -= inputNumber;
    }

    public void multiply(double inputNumber){
        result *= inputNumber;
    }

    public void divide(double inputNumber){
        result /= inputNumber;
    }

    public void reset(){
        result = 0.0;
    }
}
