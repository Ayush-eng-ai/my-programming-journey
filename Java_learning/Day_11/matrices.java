//  2D Arrays

import java.util.*;


// @SuppressWarnings("unused")
public class matrices{
    public static void search(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at: " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("Not found");
        

    }

    public static void main(
        String args[]) {
            int matrix[][] =  new int[3][3];
            
            int n = matrix.length, m = matrix[0].length;

            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            // output
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            search(matrix, 5);
            System.out.println("Diagonal sum: " + DiagonalSum.diagonalSum(matrix));
            SprialMatrix.sprial(matrix);

        }
    
} 


class SprialMatrix{

    public static void sprial(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol) {
            // top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            if(startRow < endRow) {
                for(int j = endCol - 1; j >= startCol; j--){
                    System.out.print(matrix[endRow][j] + " ");
                }
            }
            // left
            if(startCol < endCol) {
                for(int i = endRow - 1; i > startRow; i--){
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        sprial(matrix);
    }
}


/*
// Diagonal Sum
             Given a square matrix, calculate the sum of its primary and secondary diagonals. If the matrix has an odd size, the center element should only be counted once in the total sum.
 */
class DiagonalSum{
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix[0].length; j++){

        //     if(i == j) {
        //         sum += matrix[i][j];
        //     }

        //     else if(i + j == matrix.length - 1) {
        //         sum += matrix[i][j];
        //     }
        // }

        // }


                // Optimized approach
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // primary diagonal
            if(i != matrix.length - 1 - i) { // to avoid counting the center element twice
                sum += matrix[i][matrix.length - 1 - i]; // secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }
}



//  Search in Sorted Matrix
/*
    Given a 2D matrix where each row is sorted in ascending order and each column is also sorted in ascending order, write a function to search for a specific target value. The function should return the position of the target value if found, or indicate that it is not present in the matrix.

        * Brute Force Approach: Iterate through each element of the matrix and compare it with the target value. This approach has a time complexity of O(n*m), where n is the number of rows and m is the number of columns.

        * Optimized Approach: Start from the top-right corner of the matrix. If the current element is equal to the target, return its position. If the current element is greater than the target, move left (decrease column index). If the current element is less than the target, move down (increase row index). This approach has a time complexity of O(n + m), where n is the number of rows and m is the number of columns. 
 */


class SearchInSortedMatrix {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("Found Key at (" +row + "," + col + ")");
                return true;
            }
            else if(matrix[row][col] > key) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }   

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        
        int key = 8;
        // search(matrix, 8);
        staircaseSearch(matrix, key);
    }
}
