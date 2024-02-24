package cydeo.task2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBasketballPlayer {

    public static void main(String[] args) {


        List<BasketBallPlayer> list  = new ArrayList<>();

        list.add(new BasketBallPlayer("Lebron James",203,4));
        list.add(new BasketBallPlayer("Kobe Bryant",198,5));
        list.add(new BasketBallPlayer("Michael Jordan",196,6));


        //System.out.println(list);
       Greatest greatest = basketBallPlayer -> basketBallPlayer.getChampionship()>3 && basketBallPlayer.getHeight()<200;


        System.out.println(listOfGreatest(list,greatest));


    }
private static List<BasketBallPlayer> listOfGreatest(List<BasketBallPlayer> list,Greatest greatest){
        List<BasketBallPlayer> result = new ArrayList<>();

    for (BasketBallPlayer eachbasketBallPlayer : list) {
       if(greatest.winner(eachbasketBallPlayer)){
        result.add(eachbasketBallPlayer);
    }}
    return result;
}

}
