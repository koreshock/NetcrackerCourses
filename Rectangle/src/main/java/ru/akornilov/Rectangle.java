package ru.akornilov;


public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        if (length <=0 || width <= 0){
            throw new IllegalArgumentException("value of 'length' or 'wigth' is negative");
        }
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length <=0){
            throw new IllegalArgumentException("value of 'length' or 'wigth' is negative");
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width <= 0){
            throw new IllegalArgumentException("");
        }
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimetr(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
