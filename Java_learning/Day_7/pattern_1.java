package Day_7;

//  Print Hollow Rectangle Pattern


public class pattern_1 {
    public static void hollow_rectangle(int rows, int cols) {
        // outer loop for rows 
        for(int i = 1; i <= rows; i++) {
            // inner Loop for columns
            for(int j = 1; j <= cols; j++) {
                // check for first and last row and first and last column
                if(i == 1 || i == rows || j == 1 || j == cols) {
                    // boundary cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
    public static void main(String args[]) {
        int rows = 9;
        int cols = 9;
        hollow_rectangle(rows, cols);

    }
    
}

// Inverted & Rotated Half Pyramid Pattern

class pattern_2 {
    public static void inverted_rotated_half_pyramid(int n) {
        // outer loop for rows
        for(int i = 1; i <= n; i++) {
            // inner loop for spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop for stars
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 5;
        inverted_rotated_half_pyramid(n); 
    }

}

// Inverted Half Pyramid Pattern with numbers


class pattern_3 {
    public static void inverted_half_pyramid_with_numbers(int n) {
        // outer Loop for rows
        for(int i = 1; i <= n; i++) {
            // inner loop for spaces
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j +" ");
            }
            // inner loop for numbers
            // for(int k = 1; k <= i; k++) {
            //     System.out.print( " ");
            // }
            System.out.println();
        }

    }

    public static  void main(String args[]) {
        int n = 5;
        inverted_half_pyramid_with_numbers(n);
    }
}


// Floyd's Triangle Pattern

class pattern_4 {
    public static void floyds_triangle(int n) {
        int number = 1;
        // outer loop for rows
        for(int i = 1; i <= n; i++) {
            // inner loop for numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 6;
        floyds_triangle(n);
    }
}


//  0-1  Triangle Pattern
class pattern_5 {
    public static void zero_one_triangle(int rows){
        // outer Loop for rows
        for(int i = 1; i <= rows; i++) {
            //  inner Loop for columns
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    } 

    public static void main(String args[]) {
        int rows = 5;
        // int cols = 5;
        zero_one_triangle(rows);
    }
}


// Butterfly Pattern

class pattern_6 {
    public static void butterfly_pattern(int n) {
        // upper half
        for(int i = 1; i <= n; i++) {
            // left wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for(int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // right wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i = n; i >= 1; i--) {
            // left wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for(int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // right wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 5;
        butterfly_pattern(n);
    }
}


// Solid Rhombus Pattern
class pattern_7 {
    public static void solid_rhombus(int n) {
        // outer loop for rows
        for(int i = 1; i <= n; i++) {
            // inner loop for spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop for stars
            for(int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }

    public static void main(String args[]) {
        int n = 8;
        solid_rhombus(n);
    }
}

// Hollow Rhombus Pattern

class pattern_8 {
    public static void hollow_rhombus(int n) {
        // outer loop for rows
        for(int i = 1; i <= n; i++) {
            // inner Loop for spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner Loop for stars
            for(int k = 1; k <= n; k++) {
                if(i == 1 || i ==n || k == 1 || k == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 8;
        hollow_rhombus(n);
    }   
}


// Diamond Pattern

class pattern_9 {
    public static void diamond_pattern(int n) {
        // upper half
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        // lower half
        for(int i = n; i >= 1; i--) {
            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 12;
        diamond_pattern(n);
    }
}

    

