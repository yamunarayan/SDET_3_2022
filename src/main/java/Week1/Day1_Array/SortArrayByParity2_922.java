package Week1.Day1_Array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortArrayByParity2_922 {

    /**
     * Pseudocode
     * 1. Initialise an output array and outputArrayIndex as 0
     * 2. Loop array from 0 to array length-1, if the values is even place in the current index position
     * and increment index by 2
     * 3. reset outputArrayIndex as 1
     * 4.Loop array from 0 to array length-1, if the values is odd place in the current index position
     * and increment index by 2
     */

    @Test(description = "Positive tc")
    public void td1() {
        sortByParity2(new int[]{1, 2, 3, 4, 5,6});
    }

    @Test(description = "Negative tc")
    public void td2() {
        sortByParity2(new int[]{});
    }

    @Test(description = "Edge tc")
    public void td3() {
        sortByParity2(new int[]{0,1,2,3,4,5});
    }


    private void sortByParity2(int[] input) {
        int[] output = new int[input.length];
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[index] = input[i];
                index +=2;
            }
        }

        index = 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                output[index] = input[i];
                index += 2;
            }
        }

        System.out.println(Arrays.toString(output));
    }
}
