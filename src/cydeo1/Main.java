package cydeo1;

public class Main {

    public static void main(String[] args) {
        System.out.println("How to accses a constant");


        Currency c = Currency.DIEM;

        System.out.println(c);

        System.out.println(Currency.PENNY);

        System.out.println("How to accses all constant in one time");

        Currency[] currencies = Currency.values();

        for(Currency currency : currencies){
            System.out.println(currency);
        }

        System.out.println("How to use switch case with enum");

        switch (Currency.QUARTER){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIEM:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }
        System.out.println("Operation task");
        calculate(3,5,Operation.PLUS);



    }
private static void calculate(double x,double y, Operation operation){
        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }
}
}
