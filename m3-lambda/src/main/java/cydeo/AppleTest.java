package cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.GREEN));

List<Apple> heavyApple = filtredApples(inventory,new AppleHeavy());
        System.out.println(heavyApple);
        List<Apple> greenApple = filtredApples(inventory,new AppleGreenColor());
        System.out.println(greenApple);

    }

    private static List<Apple> filtredApples(List<Apple> inventory,ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
