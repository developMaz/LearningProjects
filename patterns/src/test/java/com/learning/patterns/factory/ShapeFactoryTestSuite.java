package com.learning.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCicle(){
        //given
        ShapeFactory factory = new ShapeFactory();
        //when
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //then,
        Assert.assertEquals(Math.PI * Math.pow(5.5, 2.0), circle.getField(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());
    }

    @Test
    public void testFactorySquare() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(28.0, square.getCircumference(), 0);
        Assert.assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getField(), 0);
        Assert.assertEquals("The long rectangle", rectangle.getName());
    }
}
