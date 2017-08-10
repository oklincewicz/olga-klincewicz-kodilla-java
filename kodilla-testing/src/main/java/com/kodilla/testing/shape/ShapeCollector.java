package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }


    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure (int n) {
       Shape shape = shapes.get(n);
       return shape;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
