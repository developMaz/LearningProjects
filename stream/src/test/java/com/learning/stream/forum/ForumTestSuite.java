package com.learning.stream.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {

    @Test
    public void testGetLocationOffFriends(){
        //Given
        ForumUser user1 = new ForumUser("nick", "Nicolas", "Paris");
        ForumUser user2 = new ForumUser("vlad", "Wladimir", "Moscow");
        ForumUser user3 = new ForumUser("januszh", "Janusz", "Warsaw");
        ForumUser user4 = new ForumUser("mr.president", "Donald", "Washington");
        ForumUser user5 = new ForumUser("maybe", "Terasa", "London");

        //When
        user1.addFriend(user2);
        user1.addFriend(user3);

        user2.addFriend(user1);
        user2.addFriend(user3);
        user2.addFriend(user4);

        user3.addFriend(user4);
        user3.addFriend(user5);

        //Then
        Assert.assertEquals(3,user1.getLocationsOfFriendsOfFriends().size());
        Assert.assertFalse(user1.getLocationsOfFriendsOfFriends().contains("Paris"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Warsaw"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("London"));

        //Assert.assertTrue(user1.getLocationsOfFriends().contains("Moscow"));
       // Assert.assertTrue(user1.getLocationsOfFriends().contains("Warsaw"));
    }

}
