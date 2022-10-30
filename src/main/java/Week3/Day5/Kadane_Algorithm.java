package Week3.Day5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Kadane_Algorithm {

    @Test
    public void td1(){
        Assert.assertEquals(maxSumSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
    }


    @Test
    public void td2(){
        Assert.assertEquals(maxSumSubArray(new int[]{-2,1,0,-3}), 1);
    }


    @Test
    public void td3(){
        Assert.assertEquals(maxSumSubArray(new int[]{-2,-1,-3}), -1);
    }

    private int maxSumSubArray(int [] nums){
        if(nums.length==1)
            return nums[0];

        int sum=0,maxSum=0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if(sum<0)   sum=0;
            else maxSum=Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
