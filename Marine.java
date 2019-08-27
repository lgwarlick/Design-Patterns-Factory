public class Marine extends BioUnit implements VoiceLines {

    public Marine() {

        super();
    }

    @Override
    public String enterPlay() {
        return "Go go go!";
    }

    @Override
    public String moveOne() {
        return "I feel ya";
    }

    @Override
    public String moveTwo() {
        return "Gangway, comin' through!";
    }

    @Override
    public String underAttack() {
        return "We could use some help here!";
    }
}
