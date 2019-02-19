package com.learning.stream.immutable;

public final class ForumUserFinal {
    final private String userNameF;
    final private String realNameF;

    public ForumUserFinal(final String userNameF, final String realNameF){
        this.userNameF = userNameF;
        this.realNameF = realNameF;
    }

    public String getUserNameF() {
        return userNameF;
    }

    public String getRealNameF() {
        return realNameF;
    }
}
