package ru.akornilov;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {

    private double radius = 1.0;

    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("value of 'redius' is negative");
        }
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("value of 'redius' is negative");
        }
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius = " + radius +
                ", color = " + color  +
                ']';
    }

    public double getArea(){
        return PI * pow(radius, 2);
    }
}
