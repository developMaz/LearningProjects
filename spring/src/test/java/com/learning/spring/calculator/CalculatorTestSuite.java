package com.learning.spring.calculator;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.learning.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double testAdd = calculator.add(10, 5.0);
        double testSub = calculator.sub(10.0, 5.0);
        double testMul = calculator.mul(5.0, 2.0);
        double testDiv = calculator.div(20.0, 3.0);

        //Then
        Assert.assertEquals(15,testAdd,1);
        Assert.assertEquals(5,testSub,1);
        Assert.assertEquals(10,testMul,0.01);
        Assert.assertEquals(6.66,testDiv,0.01);
    }
}
