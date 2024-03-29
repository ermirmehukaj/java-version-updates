package cydeo.review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {
    public static void main(String[] args) {


        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nisan", 150, 2010));


        carList.forEach(car -> System.out.println(car));


        System.out.println("Traditional");

        System.out.println(filterFastCars(carList));
        System.out.println(filterNewCars(carList));

        System.out.println("Behavior Parameteriaztional");

        System.out.println(filter(carList,new CarNewPredicate()));
        System.out.println(filter(carList, new CarNewPredicate()));

        System.out.println("Fast Cars - Lambda");
        System.out.println(filter(carList, p -> p.getTopSpeed() > 160));

        System.out.println("New Cars - Lambda");

        System.out.println(filter(carList, p -> p.getTopSpeed() > 160));


    }

    private static List<Car> filterFastCars(List<Car> carList) {
        List<Car> filteredVars = new ArrayList<>();
        for (Car each : carList) {
            if (each.getTopSpeed() > 160) {
                filteredVars.add(each);
            }
        }
        return filteredVars;
    }

    private static List<Car> filterNewCars(List<Car> carList) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car each : carList) {
            if (each.getYear() > 2015) {
                filteredCars.add(each);
            }
        }
        return filteredCars;
    }

    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car each : carList) {
            if (carPredicate.test(each)) {
                filteredCars.add(each);
            }
        }
        return filteredCars;
    }


}
