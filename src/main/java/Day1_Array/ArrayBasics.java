package Day1_Array;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] arr = {1,3,4,6};
        Integer[] arr2 = {1,3,4,6};
        ArrayBasics[] a = null;

        System.out.println(arr);
        System.out.println(arr2);

        int[] arr1 = new int[4];
        System.out.println(Arrays.toString(arr1));



        int[] newArray = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1,2)));
        System.out.println(Arrays.toString(newArray));



        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));

//        System.out.println(arr2);

    }
}
