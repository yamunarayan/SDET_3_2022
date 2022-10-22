package Week1.Day2_TimeAndComplexity;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseArray {


    /**
     *
     * [1,2,3,4,5] -> [5,4,3,2,1]
     *
     * pseudocode
     * 1. init start and end index as 0 and length-1
     * 2. swap the values
     * 3. increment start and decrement end index
     * 4. start < end, else break
     */

    @Test
    public void td1(){
        reverse(new int[]{1,2,3,4});
    }

    /**
     * 1,4
     * 2,3
     *
     *
     */

    //Time complexity - O[N/2] and space Complexity -
    private void reverse(int[] input){
        int start =0, end = input.length-1, temp;
        while(start< end){
            temp = input[start];
            input[start++]=input[end];
            input[end--] = temp;
        }
        System.out.println(Arrays.toString(input));
    }
}
