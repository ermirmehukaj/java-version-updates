package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(System.out::println);

        System.out.println("Filter");
        list.stream()
                .filter(i -> i %2 ==0)
                .forEach(System.out::println);

        System.out.println("Disctint");

        list.stream()
                .filter(i-> i %2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("LIMIT");

        list.stream().
                filter(i -> i %2 ==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("SKIP");
        list.stream()
                .filter(i ->i %2 ==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("MAP");
        list.stream()
                .map(number -> number *2)
                .filter(i -> i %3 ==0)
                .forEach(System.out::println);


    }
}
