package cydeo;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {


        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.GREEN));

        OrangeFormater orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintApple(inventory,orangeLambda);

        System.out.println("----------------------------------------------------------------------------");

        OrangeFormater fancyFOrmater  = orange -> {
            String result = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A" + result + " " + orange.getColor() + " orange";
        };

        prettyPrintApple(inventory,fancyFOrmater);
    }

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormater orangeFormater){
        for (Orange orange : inventory) {
            String output = orangeFormater.accept(orange);
            System.out.println(output);
        }
    }
}
