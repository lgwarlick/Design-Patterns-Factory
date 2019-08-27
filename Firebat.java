public class Firebat extends BioUnit implements VoiceLines{

    public Firebat() {

        super();
    }

    @Override
    public String enterPlay() {
        return "Need a light?";
    }

    @Override
    public String moveOne() {
        return "Barbeque time.";
    }

    @Override
    public String moveTwo() {
        return "Smells like...victory.";
    }

    @Override
    public String underAttack() {
        return "My goose is getting cooked!";
    }
}