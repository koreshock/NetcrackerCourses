package ru.akornilov;

import org.junit.Test;

import static org.junit.Assert.*;


public class MyTriangleTest {

    private MyPoint p1 = new MyPoint();
    private MyPoint p2 = new MyPoint(0, 3);
    private MyPoint p3 = new MyPoint(3, 0);
    private MyTriangle triangle = new MyTriangle(p1, p2, p3);


    @Test
    public void testGetPerimetr(){
        double result = 6 + Math.sqrt(18);
        assertEquals(result, triangle.getPerimetr(), 0.0);
    }

    @Test
    public void testGetType(){
        String resultString = "Equilateral";
        assertEquals(resultString, triangle.getType());
    }

}