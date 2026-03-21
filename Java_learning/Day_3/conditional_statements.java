public class conditional_statements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        }
        else if (a < b) {
            System.out.println("a is less than b");
        }
        else {
            System.out.println("a is equal to b");
        }
    }
    
}

class even_odd{
    public static void main(String[] args) {
        int num = 15;
        if(num % 2 ==0){
            System.out.println(" This is a even number");
        }
        else{
            System.out.println(" This is a odd number");
        }
    }
}

// else if  Statement /ladder statement
class largest_of_three{
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        if(x > y && x > z){
            System.out.println("x is the largest number");
        }
        else if(y > x && y > z){
            System.out.println("y is the largest number");
        }
        else{
            System.out.println("z is the largest number");
        }
    }
}


// 