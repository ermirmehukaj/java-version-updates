package cydeo;

public class AppleHeavy implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
