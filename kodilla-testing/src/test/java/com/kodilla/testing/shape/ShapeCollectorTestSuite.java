package com.kodilla.testing.shape;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    //Test 1 dla addFigure - czy po dodaniu nowej figury liczba figur wynosi 1
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList<>();

        //When
        shapeCollector.addFigure(new Circle(4));
        shapes = shapeCollector.getShapes();

        //Then
        assertEquals(1, shapes.size());
    }

    //Test 2 dla removeFigure - czy próba usunięcia NIEISTNIEJĄCEJ figury skończy
    // się zwróceniem wyniku false
    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        boolean result = shapeCollector.removeFigure(new Circle(4));

        //Then
        assertFalse(result);
    }


    //Test 3 dla removeFigure - weryfikacja czy udało się usunąć wybraną figurę
    // z listy
    @Test
    public  void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapeCollector.addFigure(new Circle(4));

        //When
        boolean result = shapeCollector.removeFigure(new Circle(4));

        //Then
        assertTrue(result);
        assertEquals(0, shapes.size());
    }


    //Test 4 dla getFigure - sprawdzić czy figura pobrana jest taka sama
    //jak wstawiona
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapeCollector.addFigure(new Circle(4));

        //When
        Shape result  = shapeCollector.getFigure(0);
        shapes = shapeCollector.getShapes();

        //Then
        assertEquals(result, shapes.get(0));
    }


    //Test 5 dla showFigures - sprawdz czy wyciaga całą listę oraz czy
    // pojawiają się odpowiednie kszałty
    // ewentualnie: czy dla wszystkich figur wyciągniętych
    //z listy oblicza się poprawnie pole powierzchni?

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Triangle(2,3));
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Square(2));

        //When
        ArrayList<Shape> result = shapeCollector.getShapes();

        //Then
        assertTrue(result.size() == 4);
        assertEquals("Circle", result.get(0).getShapeName());
        assertEquals(50.2654824574, result.get(0).getField(), 0.001);
        assertEquals("Triangle", result.get(1).getShapeName());
        assertEquals(3, result.get(1).getField(), 0.001);
        assertEquals("Circle", result.get(2).getShapeName());
        assertEquals(50.2654824574, result.get(2).getField(), 0.001);
        assertEquals("Square", result.get(3).getShapeName());
        assertEquals(4, result.get(3).getField(), 0.001);
    }
}
