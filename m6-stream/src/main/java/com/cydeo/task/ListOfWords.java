package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class ListOfWords {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("Java","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(i ->i.length())
                .forEach(System.out::println);
    }
}
