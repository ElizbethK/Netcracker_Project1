package com.homework;

public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    public double evaluate(double x){
        double result = 0;
        for (int i = coeffs.length - 1; i>-1; i--){
            result += coeffs[i]*Math.pow(x,i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int size = (coeffs.length > right.coeffs.length) ? coeffs.length : right.coeffs.length;
        double arr[] = new double[size];


    }


    public MyPolynomial multiply(MyPolynomial right){
        int size = right.coeffs.length + coeffs.length - 1;
        double arr[] = new double[size];
        for (int i = 0; i < coeffs.length; i++ ){
            for (int j = 0; j < right.coeffs.length; j++ ) {
                arr[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(arr);

    }






    @Override
    public String toString() {
        return ;
    }
}
