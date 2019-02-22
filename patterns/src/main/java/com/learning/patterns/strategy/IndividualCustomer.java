package com.learning.patterns.strategy;

public class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservatiePredictor();
    }
}
