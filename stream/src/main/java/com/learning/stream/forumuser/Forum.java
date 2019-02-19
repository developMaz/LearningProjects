package com.learning.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

   private final List<ForumUser> userList = new ArrayList<>();

   public Forum(){
       userList.add(new ForumUser(1,"User 1", 'M',1, 4, 1980, 165));
       userList.add(new ForumUser(2,"User 2",'M',21, 2, 1990, 60));
       userList.add(new ForumUser(3,"User 3", 'F',30,  4,2000, 2));
       userList.add(new ForumUser(4,"User 4", 'F',12,3, 2010, 0));
       userList.add(new ForumUser(5,"User 5", 'M',14,4,2015, 65));
       userList.add(new ForumUser(6,"User 6",'M',6,7, 1970, 5));
       userList.add(new ForumUser(7,"User 7", 'F',17, 8, 1960, 15));
       userList.add(new ForumUser(8,"User 8", 'F',3,9,2001,0));
   }

   public List<ForumUser> getUserList(){
       return new ArrayList<>(userList);
   }





}
