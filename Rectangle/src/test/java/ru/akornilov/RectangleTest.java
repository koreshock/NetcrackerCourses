package ru.akornilov;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class RectangleTest {

    @Test
    public void whenLengthAndWidthNotDefined(){
        Rectangle rectangle = new Rectangle();
        double resultArea = rectangle.getArea();
        assertEquals(1.0f * 1.0f, resultArea, 0.005);
        double resultPer = rectangle.getPerimetr();
        assertEquals(2 * (1.0f + 1.0f), resultPer, 0.005);
    }

    @Test
    public void whenLenthAndWidthMoreZero(){
        Rectangle rectangle = new Rectangle(2.0f, 3.0f);
        double resultArea = rectangle.getArea();
        double resultPerimetr = rectangle.getPerimetr();
        assertEquals(2.0f * 3.0f, resultArea, 0.005);
        assertEquals(2*(2.0f + 3.0f), resultPerimetr, 0.005);
    }

    @Test
    public void testToStringMethod(){
        Rectangle rectangle = new Rectangle();
        String resultString = "Rectangle[length=1.0, width=1.0]";
        assertEquals(resultString, rectangle.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenLengthOrWidthLessZeroInSetMethodExeption(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(-1.0f);
    }

    @Rule
    public ExpectedException exeption = ExpectedException.none();

    @Test
    public void whenLengthOrWidthLessZeroInConstructorExeption(){
        exeption.expect(IllegalArgumentException.class);
        exeption.expectMessage("value of 'length' or 'wigth' is negative");
        Rectangle rectangle = new Rectangle(-1.0f, 0.0f);
    }


}