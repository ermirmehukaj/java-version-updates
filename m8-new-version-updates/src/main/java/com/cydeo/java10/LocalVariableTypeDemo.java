package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {


        //Type Inference
       var str = "Cydeo";
       var number = 5;

        var numbers = Arrays.asList(1,2,3,4,5,5);

        var sum = 0;

        for (var each : numbers) {
            sum = sum+number;
        }
    }
}
