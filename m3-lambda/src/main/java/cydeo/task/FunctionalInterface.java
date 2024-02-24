package cydeo.task;

import cydeo.Apple;
import cydeo.ApplePredicate;

public class FunctionalInterface {
    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };
    }
}
