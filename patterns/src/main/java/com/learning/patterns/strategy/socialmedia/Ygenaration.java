package com.learning.patterns.strategy.socialmedia;

public class Ygenaration extends User{

    public Ygenaration(String name){
        super(name);
        this.socialNetwork = new Twitter();
    }
}
