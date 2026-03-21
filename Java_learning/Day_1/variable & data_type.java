package Day_1;



// // Print Patterns in Java
// public class java_Basic {

//     public static void main(String args[] ) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }

// }



// public  file 
// class java_Basic {

//     public static void main(String args[] ) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }

// }

/*
//  Sum of a  & b
class SumExample {

    public static void main(String args[] ) { 
        // code to calculate the sum of two numbers
int a = 10;
int b = 20;
int sum = a + b;
System.out.println("The sum of a and b is: " + sum);}}
 

 */


/*import java.util.*;

public class java_input {

        public static void main(String args[] ) {
            try (Scanner sc = new Scanner(System.in)) {
                // String input = sc.next();
                // System.out.println("You entered: " + input);
                String name= sc.nextLine();
                System.out.println("Your name is:" + name);
                int number = sc.nextInt();
                System.out.println(number);
                float price = sc.nextFloat();
                System.out.println(price);

            }
        }
    }*/
/* 
// Quetion:  Sum of two number a & b using user input
import java.util.*;
class javaSumOf_user{
    public static void main(String args[]) {
        try(Scanner ch = new Scanner(System.in) )
        {
            int a = ch.nextInt();
            int b = ch.nextInt();
            int sum = a + b;
            System.out.println(sum);

        }
    }
}*/
// Question: Product of a & b using input from user
import java.util.*;
class javaProductof_user{
    public static void main(String args[]){
        try(Scanner ph = new Scanner(System.in)){
            float p = ph.nextFloat();
            float q = ph.nextFloat();
            float product = p * q;
            System.out.println(product);


        }
    }

}

// Question: Area of a circle using user input
class javaAreaOfCircle_user{
    public static void main(String args[]) {
        try(Scanner Ac = new Scanner(System.in)){
            float radious = Ac.nextFloat();
            float area = 3.14f *radious * radious;
            System.out.println(area);

        }
    }
}

/* Type Conversion/ widening /implicit type conversion 


Conversion happens when:
a.type compatible
b.destination type > source type


byte->short->int->long->float->double

*/

class javaTypeConversion{
    public static void main(String args[]) {
        int a = 10;
        float b = a; // implicit type conversion
        System.out.println(b);
    }
}

//  Type Casting/ Narrowing/ Explicit type conversion
/*
Conversion happens when:
a.type compatible
b.destination type < source type

int marks = (int)(99.99f);

*/

class javaTypeCasting{
    public static void main(String args[]) {
        float price = 99.99f;
        int marks = (int)price; // explicit type conversion
        System.out.println(marks);
    }
}



// Type Promotion in Expressions

/* 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
2. If one operand is long, float or double the whole expression is promoted to long, float or double respectively.*/

class javaTypePromotion{
    public static void main(String args[]) {
        // byte a = 10;
        // byte b = 20;
        // int c = a + b; // type promotion to int
        // System.out.println(c);

        short a = 12;
        byte b = 34;
        char c = 'c';
        byte bt = (byte)(a + b + c); // type promotion to int and then cast back to byte
        System.out.println(bt);
    } 
}
