package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant){
        participants.add(participant);
        System.out.println("To team " + name +  " added new participant " + participant.getName() );
    }

    public void playWith(Team<T> t) {
        String winnerName;
        Random r = new Random();
        int i = r.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = t.name;
        }
        System.out.println("The team " + winnerName + " won");

    }
}
