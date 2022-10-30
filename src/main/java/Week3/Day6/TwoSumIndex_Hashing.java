package Week3.Day6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TwoSumIndex_Hashing {

    /*
    Pseudocode
    1. Initialize an HashMap and output array of index 2
    2. Loop form 0 to length of the array
    3. if the target-currentValue is in the map (we found two number which sums to target). return the index of the number and i
    4. else add the value and its index in the HashMap

    Time Complexity - O[N]
    Space Complexity - O[N]
     */

    @Test
    public void td1(){
        Assert.assertEquals(twoSum(new int[]{2,11,15,7,7}, 9), new int[]{0,3});
    }

    @Test
    public void td2(){
        Assert.assertEquals(twoSum(new int[]{2,11,15,2,7}, 4), new int[]{0,3});
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexValueMap = new HashMap<>();
        int[] output = new int[2];


        for(int i=0;i<nums.length;i++){

            //map contains target-nums[i]
            if(indexValueMap.containsKey(target-nums[i])){
                output[0]=indexValueMap.get(target-nums[i]);
                output[1]=i;
                return output;
            }else
                //add the value, index to HashMap
                indexValueMap.put(nums[i],i);
        }
        return output;
    }

}
