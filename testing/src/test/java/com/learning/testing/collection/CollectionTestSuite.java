package com.learning.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Start Test Case");
    }

    @After
    public void after() {
        System.out.println("End Test Case");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Start Test Suite");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Finish Test Suite");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //Then
        Assert.assertTrue(result.isEmpty());
        System.out.println("Empty List test is correct");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 20 ; i++){
            numbers.add(i);
        }
        //When
        exterminator.exterminate(numbers);
        //Then
        Assert.assertNotNull(numbers);
        System.out.println("Not empty list test is correct");


    }
}
