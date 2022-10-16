package Day2_TimeAndComplexity;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortArray {

    private void sort(int[] input){
        int loop = 0;


        for(int i =0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
                loop++;
            }
        }
            System.out.println(Arrays.toString(input));
            System.out.println(loop);
    }

    @Test
    public void td1(){
        sort(new int[]{1,4,3,2});
        sort(new int[]{1,4,3,2,1,4,3,2});
        sort(new int[]{1,4,3,9,4,3,2});
    }

}
