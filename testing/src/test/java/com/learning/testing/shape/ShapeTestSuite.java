package com.learning.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeTestSuite {

    static int counter = 0;

    @AfterClass
    public static void aC(){
        System.out.println("End of all tests. Go home!");
    }

    @BeforeClass
    public static void bC(){
        System.out.println("Starting test suite...");
    }

    @Before
    public void before(){
        counter++;
        System.out.println("Starting test number " + counter);
    }

    @After
    public void after() {
        System.out.println("End of test");
    }

    @Test
    public void testAddingShape() {
        //Given
        Square square = new Square(5, "kwadrat");
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addShape(square);
        //Then
        Assert.assertEquals(1, shapeCollector.numberOfShapes());
    }

    @Test
    public void testRemovingShape() {
        //Given
        Circle circle = new Circle(10, "Kółko");
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(circle);
        //When
        boolean result = shapeCollector.removeShape(circle);
        //Then
        Assert.assertEquals(0,shapeCollector.numberOfShapes());
        Assert.assertFalse(result);
    }

    @Test
    public void testGetShape() {
        //Given
        Shape triangle = new Triangle(5,4,3, "Trójkąt");
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(triangle);
        //When
        Shape result = shapeCollector.getShape(0);
        //Then
        Assert.assertEquals(result, triangle);
    }


}
