package ru.akornilov;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void whenRadiusNotDefined(){
        Circle circle = new Circle();
        double result = circle.getArea();
        assertEquals(Math.PI * 1.0 * 1.0, result, 0.005);
    }

    @Test
    public void whenRadiusMoreZero(){
        Circle circle = new Circle(10);
        double result = circle.getArea();
        assertEquals(Math.PI * 10.0 * 10.0, result, 0.005);
    }

    @Test
    public void testToStringMethod(){
        Circle circle = new Circle();
        String resultString = "Circle[radius = 1.0, color = red]";
        assertEquals(resultString, circle.toString());
    }


    @Test(expected = IllegalArgumentException.class)
    public void whenRadiusLessZeroInSetMethodExeption(){
        Circle circle = new Circle();
        circle.setRadius(-4);
    }

    @Rule
    public ExpectedException exeption = ExpectedException.none();

    @Test
    public void whenRadiusLessZeroInConstructorExeption(){
        exeption.expect(IllegalArgumentException.class);
        exeption.expectMessage("value of 'redius' is negative");
        Circle circle = new Circle(-2);
    }

}