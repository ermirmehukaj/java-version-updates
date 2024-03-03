package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);


        int result2 = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum).get();
        System.out.println(result2);


        System.out.println("Max and min");

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);


        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());
        System.out.println("COunt");
        long dishCount = DishData.getAll().stream().count();

        System.out.println(dishCount);


    }
}
