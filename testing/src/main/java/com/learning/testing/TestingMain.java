package com.learning.testing;

import com.learning.testing.forum.ForumPost;
import com.learning.testing.forum.ForumUser;

public class TestingMain {

    public static void main (String[] args) {

  /*      ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i <= 20 ; i++){
            numbers.add(i);
        }

        System.out.println(numbers.toString());

        OddNumbersExterminator exterminate = new OddNumbersExterminator();
        exterminate.exterminate(numbers);*/




/*        public void exterminate(ArrayList<Integer> numbers){

            for(int n : numbers) {

            }
        }*/

        ForumUser forumUser = new ForumUser("mickey", "Michael");
        ForumPost post = new ForumPost("This is my post", "mickey");

        forumUser.addPost(post.getPostauthor(),post.getPostbody());
        System.out.println(forumUser.getPost(0).toString());
    }
}
