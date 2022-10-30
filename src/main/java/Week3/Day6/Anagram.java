package Week3.Day6;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Anagram {
    @Test
    public void td1(){
        System.out.println(asciiArray_Optimised("anagram","nagaram"));
    }

    @Test
    public void td2(){
        System.out.println(asciiArray_Optimised("anagram","nagaram"));
    }

    /*
    Pseudocode
    1. initialize hashmap for each string
    2. add occurrence ofr both string
    3. equate both hashmap

    Time Complexity - O[N]
    Space Complexity - O[N]
     */
    private boolean hashMap(String s, String t){
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i<s.length();i++) {

          /*
          Explanation for getOrDefault
          if(sMap.containsKey(s.charAt(i))){
                int occurance = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), occurance+1);
            }else
                sMap.put(s.charAt(i), 1);
          */

            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
        }
        return sMap.equals(tMap);
    }

    /*
    Pseudocode
    1. initialize int array for each string
    2. add occurrence for both string by currentCharacter-'a'
    3. equate both arrays

    Time Complexity - O[N]
    Space Complexity - O[N]
     */
    private boolean asciiArray_bruteForce(String s, String t){
        int[] arrS = new int[26];
        int[] arrT = new int[26];

        for (char each: s.toCharArray())
            arrS[each-'a']++;

        for (char each: t.toCharArray())
            arrT[each-'a']++;

        return Arrays.equals(arrS,arrT);
    }

    /*
   Pseudocode
   1. initialize int array for each string
   2. add occurrence for string s by currentCharacter-'a' and decrement for each occurrence of character in String t in respective loop
   3. validate all values in array is zero, else return false(as different character is present)

   Time Complexity - O[N]
   Space Complexity - O[N]
    */
    private boolean asciiArray_Optimised(String s, String t){
        int[] arr = new int[26];

        for (char each: s.toCharArray())
            arr[each-'a']++;

        for (char each: t.toCharArray())
            arr[each-'a']--;

        return IntStream.of(arr).allMatch(n -> n ==0);
    }

    /*
  Pseudocode
  1. initialize int array for each string
  2. add occurrence for string s by currentCharacter-'a' and decrement for each occurrence of character in String t in same loop
  3. validate all values in array is zero, else return false(as different character is present)

  Time Complexity - O[N]
  Space Complexity - O[N]
   */
    private boolean asciiArray_OptimisedV2(String s, String t){
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];

        for (int i =0; i <s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        return IntStream.of(arr).allMatch(n -> n ==0);
    }

}
