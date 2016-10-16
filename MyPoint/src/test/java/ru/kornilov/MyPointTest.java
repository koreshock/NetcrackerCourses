package ru.kornilov;

import org.junit.Test;

import static org.junit.Assert.*;


public class MyPointTest {

    private MyPoint point = new MyPoint();
    private MyPoint point2 = new MyPoint(3, 3);

    @Test
    public void testDistanceWithoutParametrs(){
        assertEquals(0, point.distance(),0);
        assertEquals(Math.sqrt(18), point2.distance(),0);
    }

    @Test
    public void testDistanseWithXYParametrs(){
        assertEquals(Math.sqrt(8), point2.distance(5, 5), 0);
    }

    @Test
    public void testDistanseWithAnotherPoint(){
        assertEquals(Math.sqrt(32), point2.distance(new MyPoint(7,7)), 0);
    }

    @Test
    public void testToString(){
        String resultString = "(3, 3)";
        assertEquals(resultString, point2.toString());
    }
}