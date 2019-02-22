package com.learning.patterns.strategy.socialmedia;

public class Millenials extends User {

    public Millenials(String name){
        super(name);
        this.socialNetwork = new Snapchat();
    }
}
