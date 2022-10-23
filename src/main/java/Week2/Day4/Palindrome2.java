package Week2.Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Palindrome2 {

    @Test
    public void td1(){
        Assert.assertEquals(validPalindrome("abc"), false);
    }

    @Test
    public void td2(){
        Assert.assertEquals(validPalindrome("abac"), true);
    }

    @Test
    public void td3(){
        Assert.assertEquals(validPalindrome("aba"), true);
    }


    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
        }
        return true;
    }

    public boolean isPalindrome(String s, int left, int right){
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
