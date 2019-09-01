/**
 * The superclass for all Terran Biological units
 * This is an abstract class as no generic BioUnit can be created
 */


public class BioUnit implements VoiceLines {

    private String name;
    private int health;
    private int range;
    private int mineralCost;
    private int gasCost;
    private int offenseUpgrade;
    private int defenseUpgrade;


    /**
     * Getters and setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    /**
     * Methods from VoiceLines interface
     * @return to be determined by the specific object
     */

    @Override
    public String enterPlay() {
        return null;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String underAttack() {
        return null;
    }

    @Override
    public String attackEnemy() {
        return null;
    }
}
