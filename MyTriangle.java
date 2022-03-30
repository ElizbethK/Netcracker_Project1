package com.homework;


import java.security.spec.ECParameterSpec;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        double epsilon = 0.000001d;
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v2.distance(v1);
        if(Math.abs(side1-side2) < epsilon & Math.abs(side2-side3) < epsilon
                & Math.abs(side3-side1) < epsilon){
            return "this triangle is equilateral";
        } else if (Math.abs(side1-side2) > epsilon || Math.abs(side2-side3) > epsilon
                || Math.abs(side3-side1) > epsilon ){
            return "this triangle is versatile";
        } else
            return "this triangle is isosceles";
    }


    @Override
    public String toString() {
        return "MyTriangle [v1=" + v1
                + ", v2=" + v2
                + ", v3=" + v3 + "]";
    }
}
