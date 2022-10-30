package Week3.Day5;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DutchFlag_Algorithm {

    @Test
    public void td1(){
        Assert.assertEquals(bruteForce(new int[]{1,2,0,2,1}), new int[]{0,1,1,2,2});
    }


    @Test
    public void td2(){
        Assert.assertEquals(dutchFlag(new String[]{"Red","White","Blue","Red","White"}), new String[]{"Blue","Red","Red","White","White"});
    }

    //invalid data for 3 pointer problem
    @Test
    public void td3(){
        Assert.assertEquals(dutchFlag(new String[]{"Red","White","Red","White"}), new String[]{"Red","Red","White","White"});
    }

    private int[] bruteForce(int[] input){
        int[] output = new int[input.length];
        int index =0;
        for(int i : new int[]{0,1,2}){
            for( int j =0; j < output.length; j++){
                if(input[j] == i) output[index++] = i;
            }
        }
        return output;
    }

    private String[] dutchFlag(String[] input){
        int low =0, middle =0, high = input.length-1;
        while(middle <= high){
            if(input[middle].equals("Blue")){
                String temp = input[middle];
                input[middle++] = input[low];
                input[low++] = temp;
            }else if(input[middle].equals("Red")){
                middle++;
            }else{
                String temp = input[middle];
                input[middle] = input[high];
                input[high--] = temp;
            }
        }
        return input;
    }

}
