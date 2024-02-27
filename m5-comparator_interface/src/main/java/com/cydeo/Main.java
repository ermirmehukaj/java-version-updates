package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,1,2,5);
        System.out.println(list);

        //Ascending
        Collections.sort(list);
        System.out.println(list);
        //Descending
        Collections.sort(list, new MyComperator());
        System.out.println(list);

        Collections.sort(list,((o1, o2) -> (o1>o2) ? -1 : (o1<o2)? 1:0));

        //Ascending
        list.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(list);

        //Descending
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

    }


}
