package Week2.Day3;

import org.testng.annotations.Test;

public class BlackAndWhite {
/**
 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
 *
 * You are also given an integer k, which is the desired number of consecutive black blocks.
 *
 * In one operation, you can recolor a white block such that it becomes a black block.
 *
 * Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
 */
    /**
     * 1. init counter, index as zero and minimum as Integer.Max value
     * 2. Loop till first k elements and take counter of white
     * 3. Check the minimum between minimum variable and the counter
     * 4. loop till end and add the last index and remove the counter the first index
     * 5. return the minimum value
    */

    @Test
    public void td1(){
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }

    @Test
    public void td2(){
        System.out.println(minimumRecolors("WBWBBBW", 2));
    }

    public int minimumRecolors(String blocks, int k) {
        int counter =0, index =0, minimum = Integer.MAX_VALUE;

        while(index < k){
            if(blocks.charAt(index++) == 'W') counter++;
        }

        minimum = Math.min(minimum, counter);

        for(; index< blocks.length();index++){
            if(blocks.charAt(index-k) == 'W') counter--;
            if(blocks.charAt(index) == 'W') counter++;
            minimum = Math.min(minimum, counter);
        }

        return minimum;
    }
}
