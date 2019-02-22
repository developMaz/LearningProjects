package com.learning.patterns.strategy;

public class ConservatiePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "Conservative predictor";
    }
}
