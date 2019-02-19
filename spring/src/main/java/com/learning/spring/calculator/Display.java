package com.learning.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {
    private double val;

    public void displayValue(double val) {
        System.out.println(val);
    }

    public double getVal() {
        return val;
    }
}
