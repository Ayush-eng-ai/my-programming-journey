import java.util.*;

public class Strings{
    // Print each letter of the string in a new line
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        
    }

    // check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }   

    public static void main(String args[]) {

        String str = "racecar";
        System.out.println(isPalindrome(str));

        // char arr[] = {'H', 'e', 'l', 'l', 'o'};
        // String str = "Hello";
        // String str2 = new String(arr);

        
        // String is immutable

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        printLetters(name);


        // Concatenation
        String firstname = "Johan";
        String lastname = "Smith";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(0));

    }
}
       

        

// Question: Given a route containing 4 directions (E,W,N,S),find the shortest path to reach destination.
// "WNEENESENNN" -> "NENNN"

class Shortest_Path {

    public static int getShortestPath(String path) {

        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {

            char direction = path.charAt(i);

            switch(direction) {

                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;

                default -> {
                }
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (int)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {

        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }

}


/* // Question: 3 For a given set of Strings, print the largest string.
        "apple", "banana", "grapefruit", "kiwi" -> "grapefruit"
*/

class Largest_String {
    // public static String getLargestString(String arr[]) {

    // }

    public static void main(String args[]) {
        

        String arr[] = {"apple", "banana", "grapefruit", "kiwi"};
        String largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(largest.compareTo(arr[i]) < 0) {
                largest = arr[i];

            }

        }

        System.out.println(largest + " , is the largest string");


        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // sb.append("Hello");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}

// Question:4   for a given String convert each the first letter of each word to uppercase
                    // "hi, i am ayush" -> "Hi, I am Ayush"
class Uppercase_First_Letter {
    public static String uppercaseFirstLetter(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));   
            }       
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi, i am ayush";
        System.out.println(uppercaseFirstLetter(str));
    }
}

/*
// Question:5 
        String Compression
        "aaabbccdee" -> "a3b2c2de2"


*/

class String_Compression {

    public static String compressString(String str) {
        String newstr = "";
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i) + count.toString();

        }
        return newstr;
    }


    public static void main(String args[]) {
        String str = "aaabbccddee";
        System.out.println(compressString(str));
        

    }
}


