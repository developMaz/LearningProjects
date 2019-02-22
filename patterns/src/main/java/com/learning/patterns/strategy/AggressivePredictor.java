package com.learning.patterns.strategy;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "Aggressive predictor";
    }
}
