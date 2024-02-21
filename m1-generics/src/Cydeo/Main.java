package Cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);


        printDoubled(items);


        System.out.println("------------------------------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseBallPlayer pat = new BaseBallPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Livepool");

       // liverpool.addPlayer(joe);
      //  liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);





    }

    private static void printDoubled(ArrayList<Integer> items) {
    for (Integer each : items){
        System.out.println(each *2);
    }
    }
}
