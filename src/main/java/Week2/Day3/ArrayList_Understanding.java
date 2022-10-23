package Week2.Day3;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_Understanding {


    /*
    internals of ArrayList -> properties, how stores the value
    how ArrayList increases the size  -> when size is zero -> grow
    constructor - default, with capacity, with collection
    methods - indexOf, lastIndexOf, size, grow, add, set, remove
    reason for non-primitive inside the <class type>
    hierarchy of the ArrayList
     */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>(hs);
        al.add(3);
        al.add(4);

        ArrayList<Integer> newAL = (ArrayList<Integer>) al.clone();

        System.out.println(al);
        newAL.set(0,2);
        System.out.println(newAL);
        System.out.println(al);

    }
}
