package Week3.Day5;

import org.testng.Assert;
import org.testng.annotations.Test;
/*https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/*/
public class Assessment_TwoSum_ii {

    @Test
    public void td1(){
        Assert.assertEquals(twoSum(new int[]{2,7,11,15}, 9), new int[]{1,2});
    }
    @Test
    public void td2(){
        Assert.assertEquals(twoSum(new int[]{1,2,3,4}, 6), new int[]{2,3});
    }

    /*
    Pseudocode
    1. Assign left =0 and right as array length -1
    2. if sum of left and right value is greater than the target, decrement right by 1
    3. if sum is lesser than the target, increment left by 1
    4. if sum is equal to target, return index of left and right by incrementing by 1, as input says arr indexed by 1

    Time Complexity - O[N/2]
    Space Complexity - O[1]

     */

    public int[] twoSum(int[] numbers, int target) {
        int left =0, right = numbers.length-1;

        while(left < right){
            if(numbers[left]+numbers[right] == target)
                return new int[]{left+1,right+1};
            else if(numbers[left]+numbers[right] < target)
                left++;
            else
                right--;
        }

        return null;
    }
}
