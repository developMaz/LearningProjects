package com.learning.patterns.strategy.socialmedia;

public class User {
    final private String name;
    protected SocialNetwork socialNetwork;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSocialNetwork(SocialNetwork socialNetwork){
        this.socialNetwork = socialNetwork;
    }

    public String sharePost(){
        return socialNetwork.socialNetwork();
    }
}
