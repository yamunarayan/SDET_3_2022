package Week3.Day6;

import java.util.Arrays;
import java.util.HashMap;

public class StringUnderstanding {

    public static void main(String[] args) {

        String a = "Test", c = "Test";
        String b = new String("Test");
        System.out.println(c);
        c = "Test1";
        System.out.println(c);


        System.out.println(a == "Test");
        System.out.println(a == new String("Test"));
        System.out.println(a.equals("Test"));
        System.out.println(a == b);



        String d ="Test2";
        d = "Testing";


        char char1 = 3546;
        System.out.println("char "+char1);

        char[] arr = a.toCharArray();
        System.out.println(Arrays.toString(arr));
        char[] arr1 = new char[2];
        a.getChars(1,2,arr1,0);
        System.out.println(Arrays.toString(arr1));

       String f = a.concat(b);
       a.equalsIgnoreCase("Te");

        System.out.println("test".trim());
        System.out.println("   te  st   ".trim());

        String.valueOf(1);

        System.out.println(Arrays.toString("Testing is in progress".split(" ")));

        System.out.println((a.codePointAt(1)));
        System.out.println(a.charAt(1));

    }
}
