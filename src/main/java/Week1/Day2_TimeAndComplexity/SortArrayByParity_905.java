package Week1.Day2_TimeAndComplexity;

import java.util.Arrays;

public class SortArrayByParity_905 {

    /**
     *Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     *
     * Return any array that satisfies this condition.
     * Example 1:
     *
     * Input: nums = [3,1,2,4]
     * Output: [2,4,3,1]
     * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     *
     *
     *
     *
     * Pseudocode
     * 1. init start and end index of the array as 0 and length-1
     * 2. find left index value is even increment by 1
     * 3. find right index value is odd decrement by 0
     * 4. if right index is even and left is odd swap
     *
     *
     * Testcases:
     *
     * positive: {3,1,2,4}
     * Negative : {}
     * Edge: {1,1,1,1}
     */


    public static void main(String[] args) {
//        sortParity(new int[]{3,1,2,4,5,6,4,3,2});
//        sortParity(new int[]{});
        sortParity(new int[]{1,1,1,1});
//        sortParity(new int[]{1,2,6,7,8,4,7,4});
    }

    //1,2,6,7,8,4,7,4

    private static void sortParity(int[] input){
        if(input.length > 2) {
            int left = 0, right = input.length - 1, temp;

            while (left < right) {
                if (input[left] % 2 != 0 && input[right] % 2 == 0) {
                    temp = input[left];
                    input[left++] = input[right];
                    input[right--] = temp;
                }
                if (input[left] % 2 == 0) left++;
                if (input[right] % 2 != 0) right--;

            }
        }
        System.out.println(Arrays.toString(input));
    }




}
