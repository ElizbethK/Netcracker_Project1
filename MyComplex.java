package com.homework;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        return (real != 0);
    }

    public boolean isImaginary(){
        return (imag != 0);
    }

//    public boolean equals(double real, double imag) {
//        double epsilon = 0.000001d;
//        MyComplex c1 = new MyComplex(real, imag);
//        MyComplex c2 = new MyComplex();
//                .......
//    }





    @Override
    public String toString() {
        return "(" + real + " + "
                + imag + "i)";
    }
}
