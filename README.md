OOP tasks


-----------------------------------------Part 1----------------------------------------------

                Implement Java classes according to the UML diagrams given below

1. Circle class

![image](https://user-images.githubusercontent.com/101325108/179971548-5a73f03b-d9b7-499d-be87-4290564187d3.png)


2. Rectangle class

![image](https://user-images.githubusercontent.com/101325108/179971650-ef11cd06-db37-4c4a-8601-a5d3279b94f0.png)


3. Employee class 

 ![image](https://user-images.githubusercontent.com/101325108/179971706-92a45f44-6376-4923-a60b-1c70885eff1f.png)


4. Book class

![image](https://user-images.githubusercontent.com/101325108/179971749-4257c856-e499-44b8-90bd-e8b44285b571.png)


5. MyPoint class

![image](https://user-images.githubusercontent.com/101325108/179971791-3794ce0b-b62f-410f-8e3f-b78d741292be.png)


6. MyTriangle class

![image](https://user-images.githubusercontent.com/101325108/179971832-9412ee04-1ed8-41b8-afe5-6e78222addf2.png)




-----------------------------------------Part 2----------------------------------------------

                       1. Implement a class for working with complex numbers


![image](https://user-images.githubusercontent.com/101325108/179972606-8794c5ae-f2fd-4cb7-886b-d314a9f5d03a.png)


• *The default MyComplex constructor creates a number of the form 0.0 + 0.0

• isReal() and isImaginary() check whether the number contains real and imaginary parts.

• It is necessary to redefine the equals method so that it returns true if the real and imaginary parts of two complex numbers coincide.

• The magnitude() method returns the modulus of a complex number

• The argument() method returns the argument of a complex number, in radians

• The AddNew(MyComplex right) and subtractNew(MyComplex right) methods add/subtract from/from the current number (this object) and the calculation result is returned as a newly created MyComplex object (i.e. the fields in this do not change, but a new object is created)

• The conjugate() method returns a MyComplex object of a complex number, paired with the current one (i.e. with this)







                           2. Implement a class for working with polynomials


 
 ![image](https://user-images.githubusercontent.com/101325108/179972804-5bade9a6-8989-441f-a78d-314ccba47674.png)


• A constructor with a variable number of arguments, creates a polynomial of degree n. In order to create a polynomial of degree n, the constructor must pass an array of size n+1 to the input, the coefficient c0 corresponds to the index 0

• * The getDegree() method returns the degree of the polynomial

• * The toString() method returns a string representation of the polynomial object in the form cn^n+cn-1x^(n-1)+...+c1 x+c0

• * The add() and multiply() methods add/multiply the current polynomial (this) with the specified one, and as a result return a new object of the MyPolynomial class







                            3.Implement a class that simulates the movement of the ball


 ![image](https://user-images.githubusercontent.com/101325108/179972892-e2b2b4cb-928e-4f9e-b18b-7cfd39ab2340.png)


• Variables x,y correspond to the coordinates of the center of the ball, radius – the radius of the ball

• xDelta (Δx) and YDelta (Δy) – correspond to the movement of the ball by a given step (they can take positive and negative values)

• The values x, y, radius, speed of movement, and direction of movement are passed to the constructor (accepts values from -1800 to +1800 ) See the figure below



![image](https://user-images.githubusercontent.com/101325108/179972937-b264622b-eeb9-42e9-8b53-e52fc09ddf13.png)



• * The speed and movement of the ball are related to the following relations:

Δx = d * cos(ϑ)

Δy = - d * sin(ϑ)


• The move() method moves the ball by a step x=x+Δx, y = y+Δy (or you can briefly write x += Δx)

• The reflectHorizontal() method changes the direction of movement of the ball horizontally to the opposite (the ball bounces off the horizontal wall), as follows: Δx=- Δx, Δy does not change

• The reflectVertical() method reverses the vertical direction of the ball (the ball bounces off the vertical wall), as follows: Δy=- Δy, Δx does not change

To test the written class, we will create an auxiliary Container class



![image](https://user-images.githubusercontent.com/101325108/179973032-984d30f0-22e2-4b8a-ab87-5eacc6f53dec.png)




• The Container class is a rectangular container or box where the ball is placed. The starting point with a point (0,0) is located in the upper left corner:


![image](https://user-images.githubusercontent.com/101325108/179973147-f4a5c2d5-5b49-4b3c-ae81-65d3b697c033.png)



• * Coordinates (x1,y1) and (x2,y2) correspond to the upper left and lower right corners of the container.

• The constructor takes as input arguments the coordinates (x,y) of the upper-left corner, width width and height height based on these calculations, the coordinates (x2,y2)

are calculated • * The collide with(Ball ball) method checks whether this ball is located within the boundaries of the container or not (taking into account radius) and returns true or false



In the class containing the main method, it is necessary to test the functionality of Ball and Container by calling the move(), collidesWidth(), etc. methods.

