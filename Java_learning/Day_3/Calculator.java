//  Income Tax Calculator
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 0;
        // double income = 600000;
        // double tax = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (income - 500000) * 0.2 + 12500; // 12500 is the tax for the first 500000
        } else {
            tax = (income - 1000000) * 0.3 + 112500; // 112500 is the tax for the first 1000000
        }
        System.out.println("The income tax is: " + tax);
    }
    
}


// Largest of three numbers using nested if statement
class largest_of_three_nested{
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        if(x > y){
            if(x > z){
                System.out.println("x is the largest number");
            }
            else{
                System.out.println("z is the largest number");
            }
        }
        else{
            if(y > z){
                System.out.println("y is the largest number");
            }
            else{
                System.out.println("z is the largest number");
            }
        }
    }
}   



// Check if a student will Pass or Fail

class pass_fail{
    public static void main(String[] args) {
        Scanner pf = new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        int marks = pf.nextInt();
        // using turnary operator
        String result = (marks >= 40) ? "The Student has passed" : "The Student has failed";
        System.out.println(result);
        // if(marks >= 40){
        //     System.out.println("The student has passed");
        // }
        // else{
        //     System.out.println("The student has failed");   
        // }
    }
}

// Switch case statement

class switch_case{
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3 & Room No. 7: ");
        int n = num.nextInt();
        switch(n){
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Pizza");
                break;
            default:
                System.out.println("We don't have that item");
        }
    }

}


//  Create a Simple Calculator  using switch case statement( + , - , * , /, %)

class simple_calculaor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }
                else{
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            case '%':
                if(num2 != 0){
                    result = num1 % num2;
                }
                else{
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        
}
}