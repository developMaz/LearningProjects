package com.learning.patterns.strategy.socialmedia;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //given
        User millenials = new Millenials("młody");
        User yGeneration = new Ygenaration("starszy");
        User zGeneration = new Zgeneration("stary");

        //when
        String mPortal = millenials.sharePost();
        String yPortal = yGeneration.sharePost();
        String zPortal = zGeneration.sharePost();

        //then
        Assert.assertEquals("I'm user of Snapchat", mPortal);
        Assert.assertEquals("I'm user of Twitter", yPortal);
        Assert.assertEquals("I'm user of Facebook", zPortal);
    }
}
