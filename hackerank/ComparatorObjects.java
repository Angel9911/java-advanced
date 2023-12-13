package interview_tasks_paysafe.object_oriented.softuni.java_advanced.hackerank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        int compareScores = Integer.compare(o2.score, o1.score);

        int compareNames = o1.name.compareTo(o2.name);

        if(compareScores == 0){
            return compareNames;
        }

        return compareScores;
    }

}

public class ComparatorObjects {


    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        scanner.nextLine();
        for(int i=0;i<n;i++){
            String[] playerData = scanner.nextLine().split(" ");
            players[i] = new Player(playerData[0],Integer.parseInt(playerData[1]));
        }
        scanner.close();

        Arrays.sort(players,checker);

        Arrays.stream(players).forEach(player -> System.out.printf("%s %s\n",player.name,player.score));
    }
}
