package Week2.Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Palindrome {

    @Test
    private void td1(){
        Assert.assertEquals(expandFromCenter("aba"), true);
        Assert.assertEquals(expandFromCenter_fromEdges("aba"), true);
    }

    @Test
    private void td2(){
        Assert.assertEquals(expandFromCenter("abcba"), true);
        Assert.assertEquals(expandFromCenter_fromEdges("abcba"), true);
    }

    @Test
    private void td3(){
        Assert.assertEquals(expandFromCenter("apba"), false);
        Assert.assertEquals(expandFromCenter_fromEdges("apba"), false);
    }

    @Test
    private void td4(){
        Assert.assertEquals(expandFromCenter("abba"), true);
        Assert.assertEquals(expandFromCenter_fromEdges("abba"), true);
    }

    private boolean expandFromCenter(String s){
        int left = s.length()/2-s.length()%2, right = s.length()/2+s.length()%2;

        if(left==right) left--;

        while(left >=0){
            if(s.charAt(left--) != s.charAt(right++)) return false;
        }
        return true;
    }

    private boolean expandFromCenter_fromEdges(String s){
        int left =0, right = s.length()-1;


        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

}
