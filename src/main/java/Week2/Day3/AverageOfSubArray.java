package Week2.Day3;

import org.testng.annotations.Test;

public class AverageOfSubArray {

    /**
     * 1. Add first k-1 elements
     * 2. Add end of the window element
     * 3. Find the average value
     * 4. subtract the first element in the array window
     * 5. repeat 2-4 till end of the array
     * 6. return max average
     */

    @Test
    public void td4(){
        int[] input = new int[]{1, -5, 30, -12};
        int k = 4;
        System.out.println(findMaxAverage(input, k));
    }

    @Test
    public void td1(){
        int[] input = {1,5,3,0};
        int k =2;
        System.out.println(findMaxAverage(input, k));
    }

    @Test
    public void td2(){
        int[] input = {1,5,3,0};
        int k = 1;
        System.out.println(findMaxAverage(input, k));
    }

    @Test
    public void td3(){
        int[] input = {1,-5,30,-12};
        int k = 3;
        System.out.println(findMaxAverage(input, k));
    }

    @Test
    public void td5(){
        System.out.println(findMaxAverage(new int[]{-1}, 1));
    }

    //Time - O[N], Space - O[1]
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        int pointer =0, sum =0;

        while( pointer < k-1)
            sum += nums[pointer++];

        for( ; pointer < nums.length; pointer++){
            sum += nums[pointer];
            maxAverage = Math.max(maxAverage,((double) sum)/k);
            sum -= nums[pointer-(k-1)];
        }
        return maxAverage;
    }
}
