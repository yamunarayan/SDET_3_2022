package Week1.Day1_Array;

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
     * 1.inti an array of same size as input, and an index variable for output array
     * 2. loop from 0 to length of the array-1
     * 3. if the number is even, add to the output array and increment the index by one
     * 4. loop from o t- length -1 and if odd add to the array and inc index by 1
     * 5. return the array
     *
     *
     * Testcases:
     *
     * positive: {3,1,2,4}
     * Negative : {}
     * Edge: {1,1,1,1}
     */


    public static void main(String[] args) {
        sortParity(new int[]{3,1,2,4,5,6,4,3,2});
        sortParity(new int[]{});
        sortParity(new int[]{1,1,1,1});
    }


    private static void sortParity(int[] input){
        int[] output = new int[input.length];
        int outputIndex =0;

        for(int i =0; i < output.length;i++){
            if(input[i]%2==0) output[outputIndex++] = input[i];
        }

        for(int i =0; i < output.length;i++){
            if(input[i]%2!=0) output[outputIndex++] = input[i];
        }
        System.out.println(Arrays.toString(output));
    }




}
