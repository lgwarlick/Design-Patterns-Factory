import java.util.ArrayList;
import java.util.Random;

public class Marine extends BioUnit implements VoiceLines {

    public Marine() {

        super();
    }

    Random randomGenerator = new Random();

    ArrayList<String> marineMove = new ArrayList<String>() {
        {
            add("Roger that!");
            add("Why not?");
            add("That's fine.");
            add("I feel ya.");
            add("Got it.");
            add("Orders received.");
            add("Aye aye, sir!");
            add("Lookin' forward to it.");
            add("Boo ya!");
            add("Gangway, comin' through");
            add("Affirmative.");
            add("Keep your shirt on, Sparky.");
            add("Sure thing!");
            add("Outstanding.");
            add("You got it!");
            add("Of course!");
            add("Yes sir!");
            add("Sure!");
            add("Ten-four.");
            add("Go go go!");
            add("Will do.");
            add("I'm on it!");
        }
    };

    ArrayList<String> marineAttack = new ArrayList<String>() {
        {
            add("Get some!");
            add("Bring it!");
            add("How's that for whoop-ass");
            add("Let's rock!");
            add("Rawr!");
            add("Gonna get me some!");
            add("Let's do this!");
            add("Die die die!");
        }
    };

    @Override
    public String enterPlay() {
        return "Go go go!";
    }

    @Override
    public String move() {
        int index = randomGenerator.nextInt(marineMove.size());
        return marineMove.get(index);
    }

    @Override
    public String underAttack() {
        return "We could use some help here!";
    }

    @Override
    public String attackEnemy() {
        int index = randomGenerator.nextInt(marineAttack.size());
        return marineAttack.get(index);
    }
}
