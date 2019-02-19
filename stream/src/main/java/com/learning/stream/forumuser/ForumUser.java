package com.learning.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    final private int id;
    final private String name;
    final private char sex;
    final private int postCouner;
    final private LocalDate birthdate;


    public ForumUser(final int id, final String name, final char sex,
                     final int birthDay, final int birthMonth, final int birthYear,
                     final int postCouner) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.postCouner = postCouner;
    }



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostCouner() {
        return postCouner;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postCouner=" + postCouner +
                '}';
    }
}
