import java.util.ArrayList;

public class UltimateTeam {

    ArrayList<UltimatePlayer> players;
    ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters() {
        String cutters = "";
        for (UltimatePlayer a: players) {
            if (a.getPosition() == "cutter") {
                cutters += a + "\n";
            }
        }
        return cutters;
    }

    public String getHandlers () {
        String handlers = "";
        for (UltimatePlayer a: players) {
            if (a.getPosition() == "handler") {
                handlers += a + "\n";
            }
        }
        return handlers;
    }

    public String toString() {
            String team = "COACHES\n";
            for (Coach b: coaches) {
                team += b + "\n";
            }

            team += "\nPLAYERS\n";
            for (UltimatePlayer b: players) {
                team += b + "\n";
            }
            return team;
    }
}
