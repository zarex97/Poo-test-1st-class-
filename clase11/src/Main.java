import java.util.ArrayList;

class Player {
    private int number;
    private String name;
    private String position;
    private int goalCounter;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }
}

class Team {
    private String name;
    private ArrayList<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player){

    }

    public void removePlayer(Player player){

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}