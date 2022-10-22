package Week1.Day2_TimeAndComplexity;

import org.testng.annotations.Test;

import java.util.Arrays;

public class AddConsecutiveNumbers {


    private void sum(int[] input, int window) {
        int[] output = new int[input.length - window+1];
        int loop =0;
        for(int i =0; i < output.length;i++){
            int sum =0;
            for(int j=i; j< i+window && j < input.length;j++){
                sum += input[j];
                loop++;
            }
            output[i]= sum;
        }
        System.out.println(Arrays.toString(output));
        System.out.println("Length :"+input.length+" - Loops : "+loop);
    }


    @Test
    private void td1(){
        //[(n-m+1)*m] -> n*m
//        sum(new int[]{1,2,3,4,5}, 3);
//        sum(new int[]{1,2,3,4,5}, 2);
//        sum(new int[]{1,2,3,4,5,1,2,3,4,5,1,2,3,4,5}, 2);
        sum(new int[]{1,2,3,23,-3}, 1);
        sum(new int[]{1,2,3,23,-3}, 2);
        sum(new int[]{1,2,3,23,-3}, 3);
        sum(new int[]{1,2,3,23,-3}, 4);
        sum(new int[]{1,2,3,23,-3}, 5);

    }
}
