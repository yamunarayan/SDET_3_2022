package Week2.Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assesment_MaxVowelsInSubString {

    @Test
    public void testData1() {
        Assert.assertEquals(maxVowels("workaattech",3), 2);
    }

    @Test
    public void testData2() {
        Assert.assertEquals(maxVowels("bcdfg",3), 0);
    }

    @Test
    public void testData3() {
        Assert.assertEquals(maxVowels("aeiou",4), 4);
    }

    @Test
    public void testData4() {
        Assert.assertEquals(maxVowels("apple",1), 1);
    }

    @Test
    public void testData5() {
        Assert.assertEquals(maxVowels("apple",0), 0);
    }


    /*
    Pseudocode:
    1. Initialize current_count, max_count and index as 0
    2. Loop till k-1 times and increment values of current_count by 1 if respective substring character is vowels
    3. Loop from k to input length and follow below steps
        a. add current_count by 1 if the index character is vowel
        b. find the maximum value of current_count and max_count and assign to max_count
        c. subtract current_count by 1 if the index-k character is vowel
    4. Return max_count

    Time Complexity: O[N]
    Space Complexity: O[1]
     */
    private int maxVowels(String input, int k){
        if(k==0) return 0;
        int current_count=0,max_count=0, index=0;

        while(index < k-1)
            current_count += isVowel(input.charAt(index++));

        while(index < input.length()) {
            current_count += isVowel(input.charAt(index++));
            max_count = Math.max(max_count, current_count);
            current_count -= isVowel(input.charAt(index-k));
        }
        return max_count;
    }

    private int isVowel(char character){
        return character =='a'||character=='e'||character=='i'||character=='o'||character=='u' ? 1 : 0;
    }
}
