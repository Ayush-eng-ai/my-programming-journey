/*
    // Syntax of function in java

    return Type name() {
    // body of a function
    
    return statement;
    }
*/

import java.util.*;

public class function {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static void main(String args[]) {
        printHelloWorld();
    }
}

class function_2 {
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 10 is " + sum(5, 10));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}


class function_3 {
    public static void printHelloWorld() { 
        System.out.println(" Hello World");
        System.out.println("Welcome to Java programming");
    }
    public static int calculateSum(int num1, int num2) {// parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        printHelloWorld();// function call or function invocation
        int result = calculateSum(5, 10); // arguments or actual parameters
        System.out.println("The sum of 5 and 10 is " + result);
        
        main_calculateSum(args); // ✅ call kiya
        main_swap(args); // ✅ call kiya
        
    }

    public static void main_calculateSum(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculateSum(a, b);// arguments or actual parameters
        System.out.println("The sum of " + a + " and " + b + " is " + result);
    }


    public static void main_swap(String args[]) {
        // swap -  values exchange
        int a = 5;
        int b = 10;


        //swapping logic
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b); 
    
    

    }

    public static void main2(String args[]) {
        // swap - values exchange 
        
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a = " + a + ", b = " + b); // a = 5, b = 10
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

class function_4 { 
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int result = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
    
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}


//  Function Overloading - same name ke functions with different parameters
// using  Parameters and data types to differentiate between functions

class function_5 {
    public static void main(String args[]) {
        int sum1 = calculateSum(5, 10);
        double sum2 = calculateSum(5.5, 10.5);
        int sum3 = calculateSum(5, 10, 15);

        System.out.println("The sum of 5 and 10 is " + sum1);
        System.out.println("The sum of 5.5 and 10.5 is " + sum2);
        System.out.println("The sum of 5, 10 and 15 is " + sum3);

    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static double calculateSum(double a, double b) {
        return a + b;
    }

    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }


}

class Question_1 {
    public static void main(String[] args) {
        // Function ko call karke result print karna
        int result = multiply(3, 5);
        System.out.println("Product is: " + result);
         
        //  second function call karna 
        int a = 6;
        int b = 5;
        int product = printProducts(a, b);
        System.out.println("Product is: " + product);
        product = printProducts(4, 6);
        System.out.println("Product is: " + product);
    }
 // Ye aapka multiply function hai
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    
    
    // second types solve this question
    public static int printProducts(int a, int b) {
        return a * b;
    }
}


            // Scope
            //  1. Method Scope - method ke andar hi accessible hota hai
            //  2. Block Scope - block ke andar hi accessible hota hai
            

class Scope{
    public static void main(String args[]) {
        int a = 5; // method scope
        if (a > 0) {
            int b = 10; // block scope
            System.out.println("Inside if block: a = " + a + ", b = " + b);
        }
        // System.out.println("Outside if block: a = " + a + ", b = " + b); // Error: b cannot be resolved to a variable
    }
}   
            // Class Scope{
            //  3. Class Scope - class ke andar hi accessible hota hai  
                    //  a. public - class ke andar aur bahar dono jagah se accessible hota hai
                    //  b. private - class ke andar hi accessible hota hai  
                    //  c. protected - class ke andar aur subclass ke andar accessible hota hai
                    //  d. default - class ke andar hi accessible hota hai
                    





