/*
 Q6- Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

 */

import java.util.Arrays;

public class Q6SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];
        
        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(squares);
        
        return squares;
    }
    
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedSquares = sortedSquares(nums);
        
        System.out.println("Sorted Squares: " + Arrays.toString(sortedSquares));
    }
}
