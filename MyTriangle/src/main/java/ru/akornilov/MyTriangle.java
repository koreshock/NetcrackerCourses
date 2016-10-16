package ru.akornilov;


public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimetr(){
        double result = 0.0;
        result = v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
        return result;
    }

    public String getType(){
        double dis1 = v1.distance(v2);
        double dis2 = v1.distance(v3);
        double dis3 = v2.distance(v3);
        if ((dis1 == dis2) && (dis2 == dis3)){
            return "Isosceles";
        }else if ((dis1 == dis2) || (dis2 == dis3) || (dis1 == dis3)){
            return "Equilateral";
        }
        return "Scalene";
    }
}
