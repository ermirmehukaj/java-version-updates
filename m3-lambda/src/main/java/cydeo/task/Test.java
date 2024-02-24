package cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<FootballPlayer1> list = new ArrayList<>();
        list.add(new FootballPlayer1("Maldini", 5, 8));
        list.add(new FootballPlayer1("Gerard", 1, 0));
        list.add(new FootballPlayer1("Henry", 1, 2));
        list.add(new FootballPlayer1("Ronney", 1, 5));

        Winners winners =footballPlayer1 ->  footballPlayer1.leagueTittleWinner > 0 && footballPlayer1.championsLeagueWinner>0;

        printWinners( list, winners);
    }

    private static void printWinners(List<FootballPlayer1> list,Winners winners){

        List<FootballPlayer1> result = new ArrayList<>();

        for (FootballPlayer1 footballPlayer1 : list) {
            if(winners.test(footballPlayer1)){
                result.add(footballPlayer1);
            }


            }
        System.out.println(result);

        }
    }
