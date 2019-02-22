package com.learning.patterns.strategy.socialmedia;

public class Snapchat implements SocialNetwork {
    final private String name = "Snapchat";

    @Override
    public String socialNetwork(){
        return "I'm user of " + name;
    }
}
