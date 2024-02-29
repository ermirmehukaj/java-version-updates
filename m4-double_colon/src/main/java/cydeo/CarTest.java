package cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


        //Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // One argument constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car::new;
        System.out.println(f2.apply(2).getModel());

        //Two Argument Constructor

        BiFunction<String,Integer,Car> a2 = Car :: new;

      Car honda = a2.apply("Honda",2015);
        System.out.println(honda.getMake() + " " + honda.getModel());

    }
}
