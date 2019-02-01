package com.learning.testing.forum;

import java.util.Objects;

public class ForumPost {
    private String postbody;
    private String author;

    public ForumPost(String postbody, String author) {
        this.postbody = postbody;
        this.author = author;
    }

    public String getPostbody() {
        return postbody;
    }


    public String getPostauthor() {
        return author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!postbody.equals(forumPost.postbody)) return false;
        return author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = postbody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ForumPost{" +
                "postbody='" + postbody + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
