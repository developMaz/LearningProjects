package com.learning.stream;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.learning.stream.beautifier.PoemBeautifier;
import com.learning.stream.beautifier.PoemDecorator;
import com.learning.stream.book.Book;
import com.learning.stream.book.BookDirectory;
import com.learning.stream.forum.ForumUser;
import com.learning.stream.forumuser.Forum;
import com.learning.stream.iterate.NumbersGenerator;
import com.learning.stream.lambda.ExecuteSaySomething;
import com.learning.stream.lambda.Executor;
import com.learning.stream.lambda.ExpressionExecutor;
import com.learning.stream.lambda.Processor;
import com.learning.stream.person.People;
import com.learning.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

/*        Processor processor = new Processor();
        processor.execute(() -> System.out.println("La la lambda"));
       // Executor codeToExecute = () -> System.out.println("coś");
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //processor.execute(codeToExecute);*/

  /*      ExpressionExecutor expressionExecutor = new ExpressionExecutor();


        System.out.println("lambdas:");
        expressionExecutor.executeExpression(10,5, (a, b) -> a+b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a-b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a*b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a/b);

        System.out.println("method references:");
        expressionExecutor.executeExpression(4,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(4,5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(4,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(4,5, FunctionalCalculator::divideAByB);*/
/*
        System.out.println("Generate even number by Stream");
        NumbersGenerator.generateEven(20);*/


      /*  BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("#elements" + theResultMapOfBooks.size());;
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue() )
                .forEach(System.out::println);



    */
/*
        BookDirectory bD= new BookDirectory();
        String stringBd = bD.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(". \n", "<<",">>"));

        System.out.println(stringBd);*/


/*        Forum forum = new Forum();
        Map<Integer, ForumUser> list = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> ((LocalDate.now().getYear() - user.getBirthdate().getYear()) >= 20))
                .filter(user -> user.getPostCouner() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("#elements: " + list.size());
        list.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);*/



        ForumUser user1 = new ForumUser("nick", "Nicolas", "Paris");
        ForumUser user2 = new ForumUser("vlad", "Wladimir", "Moscow");
        ForumUser user3 = new ForumUser("janush", "Janusz", "Warsaw");
        ForumUser user4 = new ForumUser("mr.president", "Donald", "Washington");
        ForumUser user5 = new ForumUser("maybe", "Terasa", "London");

        user1.addFriend(user2);
        user1.addFriend(user3);

        user2.addFriend(user1);
        user2.addFriend(user3);
        user2.addFriend(user4);

        user3.addFriend(user4);
        user3.addFriend(user5);

        List<String> list = user1.getFriends().stream()
                .flatMap(user -> user.getFriends().stream())
                .map(ForumUser::getLocation)
                .collect(Collectors.toList());

        System.out.println("#" + list.size());
        System.out.println(list);


    }
}
