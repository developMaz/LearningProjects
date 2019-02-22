package com.learning.patterns.strategy.socialmedia;

public class Twitter implements SocialNetwork {
    final private String name = "Twitter";

    @Override
    public String socialNetwork(){
        return "I'm user of " + name;
    }

}
