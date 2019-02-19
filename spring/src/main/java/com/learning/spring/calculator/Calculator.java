package com.learning.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {


    @Autowired
    private Display display;

    public double add(double a, double b) {
        double add = a + b;
        display.displayValue(add);
        return add;
    }

    public double sub(double a, double b){
        double sub = a - b;
        display.displayValue(sub);
        return sub;
    }

    public double mul(double a, double b) {
        double multiplying = a * b;
        display.displayValue(multiplying);
        return multiplying;
    }

    public double div(double a,double b) {
        double dividing = a / b;
        display.displayValue(dividing);
        return dividing;
    }
}
