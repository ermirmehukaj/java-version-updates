package cydeo;

public class AppleGreenColor implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
