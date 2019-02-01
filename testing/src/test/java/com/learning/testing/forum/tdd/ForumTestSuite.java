package com.learning.testing.forum.tdd;

import com.learning.testing.forum.ForumComment;
import com.learning.testing.forum.ForumPost;
import com.learning.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Begininig of tests");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Prepering to execute test nr: " + testCounter );
    }

    @After
    public void afterEveryTest(){
        System.out.println("Test nr " + testCounter + " is completed");
    }

    @Test
    public void testAddPost(){
        //Given
        //author
        ForumUser user = new ForumUser("Mickey", "Michael Jordan");
        //When
        user.addPost("Mickey", "Mickey comment");
        //Then
        Assert.assertEquals(1,user.getPostsQuantity());
    }

    @Test
    public void testAddComment(){
        //Given
        ForumPost forumPost = new ForumPost("Forum body", "Mickey");
        ForumUser user = new ForumUser("Mickey", "Mickey Jordan");
        //When
        user.addComment(forumPost, "Mickey","Comment body");
        //Then
        Assert.assertEquals(1,user.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumPost thePost = new ForumPost("Forum body", "Mickey");
        ForumUser forumUser = new ForumUser("Mickey", "Michael Jordan");
        forumUser.addPost(thePost.getPostbody(),thePost.getPostauthor());
        //When
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrivedPost);
    }

    @Test
    public void testGetComment(){
        //Given
        ForumUser user = new ForumUser("Mickey", "Michael Jordan");
        ForumPost forumPost = new ForumPost("Forum body", "Mickey");
        ForumComment comment = new ForumComment(forumPost,"Commeny body","Mickey");
        user.addComment(forumPost,comment.getAuthor(),comment.getCommentBody());
        //When
        ForumComment retrivedComment = user.getComment(0);
        //Then
        Assert.assertEquals(comment,retrivedComment);

    }

    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser user = new ForumUser("Mickey", "Michael Jordan");
        ForumPost forumPost = new ForumPost("Forum body", "Mickey");
        //When
        boolean result = user.removePost(forumPost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getPostbody(), thePost.getPostauthor());
        System.out.println(forumUser.getPost(0));

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }



}
