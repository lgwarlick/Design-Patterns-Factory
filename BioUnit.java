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

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getMineralCost() {
        return mineralCost;
    }

    public void setMineralCost(int mineralCost) {
        this.mineralCost = mineralCost;
    }

    public int getGasCost() {
        return gasCost;
    }

    public void setGasCost(int gasCost) {
        this.gasCost = gasCost;
    }

    public int getOffenseUpgrade() {
        return offenseUpgrade;
    }

    public void setOffenseUpgrade(int offenseUpgrade) {
        this.offenseUpgrade = offenseUpgrade;
    }

    public int getDefenseUpgrade() {
        return defenseUpgrade;
    }

    public void setDefenseUpgrade(int defenseUpgrade) {
        this.defenseUpgrade = defenseUpgrade;
    }

    @Override
    public String enterPlay() {
        return null;
    }

    @Override
    public String moveOne() {
        return null;
    }

    @Override
    public String moveTwo() {
        return null;
    }

    @Override
    public String underAttack() {
        return null;
    }
}
