import java.util.*;


public class do_while_loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Hello Ayush regardless of the condition, this will execute at least once.");
            i++;
        }while(i < 10);
        }
    }

//  keep entering numbers till user enters a multiple of 10

class Multipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number (enter a multiple of 10 to stop):");
            num = sc.nextInt();

        } while(num % 10 != 0);
            System.out.println("You entered a multiple of 10. Program stopped.");
    }
}





