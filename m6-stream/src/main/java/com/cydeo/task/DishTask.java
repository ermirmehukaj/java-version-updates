package com.cydeo.task;

import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {

        //Print all dishes name that has less then 400 calories
        System.out.println("Task 1 -- Print all dishes name that has less then 400 calories");
        DishData.getAll().stream()
                .filter(i -> i.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        System.out.println("Task 2 --Print the length of the name of each dish ");
        DishData.getAll().stream()
                .map(Dish::getName)
//                .map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name(>300)
        System.out.println("TAsk 3 -- Print three high caloric dish name(>300)");
        DishData.getAll().stream()
                .filter(dish ->dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("Task 4 --Print all dish name that are below 400 calories in sorted ");
        DishData.getAll().stream()
                .filter(str -> str.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);





    }
}
