package com.learning.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username = "John Doe";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
