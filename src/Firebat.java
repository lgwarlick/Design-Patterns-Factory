import java.util.ArrayList;
import java.util.Random;

public class Firebat extends BioUnit implements VoiceLines{

    public Firebat() {

        super();
    }

    Random randomGenerator = new Random();

    ArrayList<String> firebatMove = new ArrayList<String>() {
        {
            add("Mmmmm... Let's get cookin'!");
            add("Well done.");
            add("Smokin'!");
            add("Let's do this.");
            add("Barbeque time.");
            add("Humm... scorched earth.");
            add("Smells like... victory.");
        }
    };

    ArrayList<String> firebatAttack = new ArrayList<String>() {
        {
            add("FLAME ON!");
            add("Let's burn!");
            add("It's about damn time!");
            add("Ashes to ashes.");
            add("Fired up.");
            add("Cremate 'em.");
            add("They do not know who they are messing with!");
        }
    };

    @Override
    public String enterPlay() {
        return "Need a light?";
    }

    @Override
    public String move() {
        int index = randomGenerator.nextInt(firebatMove.size());
        return firebatMove.get(index);
    }

    @Override
    public String underAttack() {
        return "My goose is getting cooked!";
    }

    @Override
    public String attackEnemy() {
        int index = randomGenerator.nextInt(firebatAttack.size());
        return firebatMove.get(index);
    }
}