package com.learning.patterns.strategy.socialmedia;

public class Facebook implements SocialNetwork {
    final private String name = "Facebook";

    @Override
    public String socialNetwork(){
        return "I'm user of " + name;
    }

}
