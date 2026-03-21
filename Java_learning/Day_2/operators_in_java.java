/*
// Operators in Java
    Symbols that tell compiler to perform some operation
    Types of Operators:
        1. Arithmetic Operators (+,-,*,/,%)
        2. Assignment Operators(=,+=,-=,*=,/=,%=)
        3. Comparison Operators(==,!=,>,<,>=,<=)
        4. Logical Operators(&&,||,!)
        5. Bitwise Operators(&,|,^,~,<<,>>,>>>
        6. Ternary Operator (? :)  
        7.Relational Operators(==,!=,>,<,>=,<=)
        8. Unary Operators(++,--,!,~) 
*/

public class operators_in_java {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("After += : " + c); // 15

        // Comparison Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y)); // false
        System.out.println("x OR y: " + (x || y)); // true
        System.out.println("NOT x: " + (!x)); // false

        // Ternary Operator
        int max = (a > b) ? a : b; // if a > b, max is a, else max is b
        System.out.println("Max of a and b: " + max); // 10

    }
}