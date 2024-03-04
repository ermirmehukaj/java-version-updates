package cydeo.review;

public class Car2 {

    private String make;
    private int topSpeed;
    private int year;
    public static Car2Builder builder(){
        return new Car2Builder();
    }

    public static class Car2Builder{
        private String make;
        private int topSpeed;
        private int year;
        public Car2Builder(){

        }
        public Car2Builder make(String make){
            this.make = make;
            return this;
        }
        public Car2Builder topSpeed(int topSpeed){
            this.topSpeed = topSpeed;
            return this;
        }
        public Car2Builder year(int year){
            this.year = year;
            return this;
        }
    }
}
