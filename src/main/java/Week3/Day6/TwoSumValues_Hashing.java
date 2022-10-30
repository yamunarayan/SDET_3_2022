package Week3.Day6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumValues_Hashing {

    /*
    Pseudocode
    1. Initialize an HashSet
    2. Loop form 0 to length of the array
    3. if the target-currentValue is in the set (we found two number which sums to target). return the values
    4. else add the value in the HashSet

    Time Complexity - O[N]
    Space Complexity - O[N]
     */

    @Test
    public void td1(){
        Assert.assertEquals(twoSum(new int[]{2,11,15,7,7}, 9), new int[]{2,7});
    }

    @Test
    public void td2(){
        Assert.assertEquals(twoSum(new int[]{2,11,15,2,7}, 4), new int[]{2,2});
    }

    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){

            //map contains target-nums[i], return numbers
            if(set.contains(target-nums[i])){
                return new int[]{target-nums[i],nums[i]};
            }else
                //add the value, index to HashMap
                set.add(nums[i]);
        }
        return null;
    }

}
