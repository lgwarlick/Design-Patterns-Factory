public class Medic extends BioUnit implements VoiceLines{

    public Medic() {
        super();
    }

    @Override
    public String enterPlay() {
        return "The doctor is in.";
    }

    @Override
    public String moveOne() {
        return "Just relax.";
    }

    @Override
    public String moveTwo() {
        return "On my way.";
    }

    @Override
    public String underAttack() {
        return "Umm, better send some body bags.";
    }
}
