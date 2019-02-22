package com.learning.patterns.strategy;

public class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "Balanced predictor";
    }
}
