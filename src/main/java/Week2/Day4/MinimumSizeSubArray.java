package Week2.Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimumSizeSubArray {

    @Test
    public void td1(){
        Assert.assertEquals(minSubArrayLen(new int[]{2,3,1,2,4,3},7), 2);
    }

    @Test
    public void td2(){
        Assert.assertEquals(minSubArrayLen(new int[]{2,3,1,2,4,3},720), 0);
    }

    @Test
    public void td3(){
        Assert.assertEquals(minSubArrayLen(new int[]{1,2,3,4,5},15), 5);
    }

    @Test
    public void td4(){
        Assert.assertEquals(minSubArrayLen(new int[]{1,3,-2,4},5), 3);
    }

    public int minSubArrayLen( int[] nums, int s) {
        int output =Integer.MAX_VALUE, left =0 , right=0,maxValue=0;

        while(left<nums.length){
            if(maxValue<s && right<nums.length){
                maxValue += nums[right++];
            }else if(maxValue>=s){
                output = Math.min(output,right-left);
                maxValue -= nums[left++];
            }else
                break;
        }

        if(maxValue<s && output==Integer.MAX_VALUE)
            return 0;
        return output;
    }

}
