package com.homework;

import com.homework.Rectangle;
import com.homework.Circle;
import com.homework.Employee;
import com.homework.Author;
import com.homework.Book;

public class Main {
    public static void main(String[] args) {
         // (1) Circle class
        /*Circle circle = new Circle();

        System.out.println(circle.calculateArea());
        System.out.println(circle.toString());*/


         // (2) Rectangle class
        /*Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.toString());*/


        // (3) Employee class
        /*Employee employee = new Employee(1, "Andrew", "Simonov", 35000);

        System.out.println(employee.toString());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getLastName());
        System.out.println(employee.raiseSalary(10));*/


        //  (4) Book class
        /*Author author1 = new Author("Lewis Carroll", "lew_carr.com", 'M' );
        Author author2 = new Author("Other Writer", "other.com", 'F' );

        Book book1 = new Book("Alice in wonderland", 500.0,  author1);

        System.out.println(book1.getName());
        System.out.println(book1.getAuthors());
        System.out.println(book1.getAuthorNames());
        System.out.println(book1.toString());*/


        //  (5) MyPoint class
        /*MyPoint p = new MyPoint(2, 3);

        System.out.println(p.getXY());
        System.out.println(p.getX());
        System.out.println(p.getY());

        System.out.println(p.distance(4,5));
        System.out.println(p.distance(new MyPoint(9,9)));
        System.out.println(p.distance());
        System.out.println(p.toString());*/


        //  (6) MyTriangle class
       /* MyTriangle triangle = new MyTriangle(1, 1, 1, 1, 7, 8);

        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
        System.out.println(triangle.toString());*/

//---------------------------------Part 2-----------------------------------
         //  (1) MyComplex
       /* MyComplex mycx1 = new MyComplex(5,7);
        MyComplex mycx2 = new MyComplex(4,3);
        System.out.println(mycx1);
        System.out.println(mycx2);
        System.out.println(mycx1.isImaginary());
        System.out.println(mycx1.equals(mycx2));
        System.out.println(mycx1.magnitude());
        System.out.println(mycx1.argument());
        MyComplex mycx3 = mycx1.addNew(mycx2);
        System.out.println(mycx3);
        System.out.println(mycx3.conjugate());
        System.out.println(mycx1.multiply(mycx2));
        System.out.println(mycx1.divide(mycx2));
        System.out.println();*/



        //  (2) MyPolynomial
       /* double arr1[] = {2,5};
        double arr2[] = {2,3,4,5};
        MyPolynomial pol1 = new MyPolynomial(arr1);
        MyPolynomial pol2 = new MyPolynomial(arr2);
        MyPolynomial sum = pol1.add(pol2);
        MyPolynomial mul = pol1.multiple(pol2);
        System.out.println(pol1);
        System.out.println(pol2);
        System.out.println(pol2.getDegree());
        System.out.println(sum);
        System.out.println(mul);
        System.out.println();*/

        

        //  (3) Ball
        /*Container c1 = new Container(5,4,7,9);
        System.out.println(c1);
        Ball ball = new Ball(2,3,4,5, -33);
        System.out.println(ball);
        System.out.println(c1.collides(ball));
        ball.move();
        System.out.println(c1.collides(ball));
        ball.move();
        System.out.println(c1.collides(ball));
        ball.reflectVertical();
        ball.move();
        ball.move();
        System.out.println(c1.collides(ball));*/

    }
}
