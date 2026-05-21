package Day_9;

/* 
    Max Subarray Sum using Kadane's Algorithm
    Given an array of integers, find the contiguous subarray with the largest sum and return that
*/

public class arrays_ii {
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < numbers.length; start++) {
            int currSum = 0;
            for (int end = start; end < numbers.length; end++) {
                currSum += numbers[end];
                System.out.println("Subarray [" + start + ".." + end + "] sum = " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, 4, 6, -8, 10};
        maxSubarraySum(numbers);
        System.out.println("--- using prefix array implementation ---");
        arraysCC.maxSubarraySum(numbers);
        System.out.println("--- using Kadane's algorithm ---");
        kadane.maxSubarraySum(numbers);
    }
}

//  Time Complexity: O(n^2) - We have two nested loops to generate all possible subarrays and calculate their sums.
//  Space Complexity: O(1) - We are using only a constant amount of extra space to store the current sum and maximum sum.

// Max Subarray Sum using priefix Array



class arraysCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];  
        prefix[0] = numbers[0];

        // Calculate the prefix array
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i -1] + numbers[i]; 
        }
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("max sum = " + maxSum);

    }
        public static void main(String args[]) {
            int numbers[] = {-2, 4, 6, -8, 10};
            maxSubarraySum(numbers);
        }
}
//  Max Subarray Sum using Kadane's Algorithm


class kadane{
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {-2, 4, 6, -8, 10};
        maxSubarraySum(numbers);
    }
}
