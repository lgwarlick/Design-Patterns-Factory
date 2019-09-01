import java.util.ArrayList;
import java.util.Random;

public class Medic extends BioUnit implements VoiceLines{

    public Medic() {
        super();
    }

    Random randomGenerator = new Random();

    @Override
    public String enterPlay() {
        return "The doctor is in.";
    }

    ArrayList<String> medicMove = new ArrayList<String>() {
        {
            add("Just relax.");
            add("I'll take care of it.");
            add("Not a problem.");
            add("Ooh! How serious!");
            add("Hm. That's a serious outbreak.");
            add("Must be an emergency.");
            add("On my way.");
        }
    };

    ArrayList<String> medicAttack = new ArrayList<String>() {
        {
            add("I'll fix you!");
            add("I'll do my best.");
            add("This is gonna hurt.");
            add("Time to operate!");
            add("Call the blood-bank.");
            add("Sterilizing now!.");
            add("Patient prognosis is dead!");
        }
    };

    @Override
    public String move() {
        int index = randomGenerator.nextInt(medicMove.size());
        return medicMove.get(index);
    }

    @Override
    public String underAttack() {
        return "Umm, better send some body bags.";
    }

    @Override
    public String attackEnemy() {
        int index = randomGenerator.nextInt(medicAttack.size());
        return medicAttack.get(index);
    }
}
