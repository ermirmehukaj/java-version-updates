package cydeo.task;

public class FootballPlayer1 {

        String name;
        int championsLeagueWinner;

        int leagueTittleWinner;

        public FootballPlayer1(String name, int championsLeagueWinner, int leagueTittleWinner) {
            this.name = name;
            this.championsLeagueWinner = championsLeagueWinner;
            this.leagueTittleWinner = leagueTittleWinner;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getChampionsLeagueWinner() {
            return championsLeagueWinner;
        }

        public void setChampionsLeagueWinner(int championsLeagueWinner) {
            this.championsLeagueWinner = championsLeagueWinner;
        }

        public int getLeagueTittleWinner() {
            return leagueTittleWinner;
        }

        public void setLeagueTittleWinner(int leagueTittleWinner) {
            this.leagueTittleWinner = leagueTittleWinner;
        }

    @Override
    public String toString() {
        return "FootballPlayer1{" +
                "name='" + name + '\'' +
                ", championsLeagueWinner=" + championsLeagueWinner +
                ", leagueTittleWinner=" + leagueTittleWinner +
                '}';
    }
}
