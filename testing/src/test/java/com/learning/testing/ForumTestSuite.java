package com.learning.testing.forum;

import com.learning.testing.calculator.Calculator;
import com.learning.testing.user.SimpleUser;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: start");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: finish");
    }

    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser1 = new SimpleUser("Mary", "Mary Poppins");
        //When
        String user1 = simpleUser1.getUsername();
        //Then
        Assert.assertEquals("Mary", user1);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("Mary", "Mary Poppins");
        //When
        String realName = simpleUser.getRealName();
        //Then
        Assert.assertEquals("Mary Poppins", realName);
    }



    //test Calculator
   // Calculator calc = new Calculator();

/*    int add = calc.add(5,5);
        System.out.println("Adding = " + add);

    int subtract = calc.subtract(10,5);
        System.out.println("Subtract = " + subtract);

        if(add == 11) {
        System.out.println("Adding test is ok");
    } else {
        System.out.println("Adding test failed");
    }

        if(subtract == 5){
        System.out.println("Subtract test is ok");
    } else {
        System.out.println("Subtract test failed");
    }*/

}
