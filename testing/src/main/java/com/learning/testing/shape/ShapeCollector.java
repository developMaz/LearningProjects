package com.learning.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeContainer = new ArrayList<>();


    public void addShape(Shape shape){
        shapeContainer.add(shape);
    }

    public boolean removeShape(Shape shape) {
        boolean result = true;
        if (shapeContainer.contains(shape)) {
            shapeContainer.remove(shape);
            result = false;
        }
        return result;
    }

    public Shape getShape(int i){
       return shapeContainer.get(i);
    }

    public int numberOfShapes(){
        return shapeContainer.size();
    }
}
