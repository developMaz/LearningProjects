package com.learning.patterns.strategy.socialmedia;

public class Zgeneration extends User {

    public Zgeneration(String name){
        super(name);
        this.socialNetwork = new Facebook();
    }
}
