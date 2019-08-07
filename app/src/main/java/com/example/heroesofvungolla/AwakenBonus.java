import java.io.Serializable;

public class AwakenBonus implements Serializable, Cloneable {
    /**
     * This class contains attributes of awaken bonus gained for awakening a hero.
     */

    // Initialising private attributes of AwakenBonus class.
    private double attackSpeedUp;
    private double critRateUp;
    private double critDamageUp;
    private double evasionChanceUp;
    private double resistanceUp;
    private double accuracyUp;
    private double extraTurnChanceUp;
    private double counterattackChanceUp;
    private Skill newSkill;
    private Skill skillToBeReplaced;
    private Skill upgradedSkill;

    // Creating constructor of AwakenBonus class
    public AwakenBonus(double attackSpeedUp, double critRateUp, double critDamageUp, double evasionChanceUp,
                       double resistanceUp, double accuracyUp, double extraTurnChanceUp, double counterattackChanceUp,
                       Skill newSkill, Skill skillToBeReplaced, Skill upgradedSkill){
        this.attackSpeedUp = attackSpeedUp;
        this.critRateUp = critRateUp;
        this.critDamageUp = critDamageUp;
        this.evasionChanceUp = evasionChanceUp;
        this.resistanceUp = resistanceUp;
        this.accuracyUp = accuracyUp;
        this.extraTurnChanceUp = extraTurnChanceUp;
        this.counterattackChanceUp = counterattackChanceUp;
        this.newSkill = newSkill;
        this.skillToBeReplaced = skillToBeReplaced;
        this.upgradedSkill = upgradedSkill;
    }

    public double getAttackSpeedUp() {
        return attackSpeedUp;
    }

    public void setAttackSpeedUp(double attackSpeedUp) {
        this.attackSpeedUp = attackSpeedUp;
    }

    public double getCritRateUp() {
        return critRateUp;
    }

    public void setCritRateUp(double critRateUp) {
        this.critRateUp = critRateUp;
    }

    public double getCritDamageUp() {
        return critDamageUp;
    }

    public void setCritDamageUp(double critDamageUp) {
        this.critDamageUp = critDamageUp;
    }

    public double getEvasionChanceUp() {
        return evasionChanceUp;
    }

    public void setEvasionChanceUp(double evasionChanceUp) {
        this.evasionChanceUp = evasionChanceUp;
    }

    public double getResistanceUp() {
        return resistanceUp;
    }

    public void setResistanceUp(double resistanceUp) {
        this.resistanceUp = resistanceUp;
    }

    public double getAccuracyUp() {
        return accuracyUp;
    }

    public void setAccuracyUp(double accuracyUp) {
        this.accuracyUp = accuracyUp;
    }

    public double getExtraTurnChanceUp() {
        return extraTurnChanceUp;
    }

    public void setExtraTurnChanceUp(double extraTurnChanceUp) {
        this.extraTurnChanceUp = extraTurnChanceUp;
    }

    public double getCounterattackChanceUp() {
        return counterattackChanceUp;
    }

    public void setCounterattackChanceUp(double counterattackChanceUp) {
        this.counterattackChanceUp = counterattackChanceUp;
    }

    public Skill getNewSkill() {
        return newSkill;
    }

    public void setNewSkill(Skill newSkill) {
        this.newSkill = newSkill;
    }

    public Skill getSkillToBeReplaced() {
        return skillToBeReplaced;
    }

    public void setSkillToBeReplaced(Skill skillToBeReplaced) {
        this.skillToBeReplaced = skillToBeReplaced;
    }

    public Skill getUpgradedSkill() {
        return upgradedSkill;
    }

    public void setUpgradedSkill(Skill upgradedSkill) {
        this.upgradedSkill = upgradedSkill;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }

        if (!(obj instanceof AwakenBonus)){
            return false;
        }
        else{
            return attackSpeedUp == ((AwakenBonus) obj).attackSpeedUp && critRateUp == ((AwakenBonus) obj).critRateUp &&
                    critDamageUp == ((AwakenBonus) obj).critDamageUp && evasionChanceUp == ((AwakenBonus) obj).evasionChanceUp &&
                    resistanceUp == ((AwakenBonus) obj).resistanceUp && accuracyUp == ((AwakenBonus) obj).accuracyUp &&
                    extraTurnChanceUp == ((AwakenBonus) obj).extraTurnChanceUp && counterattackChanceUp == ((AwakenBonus) obj).counterattackChanceUp &&
                    newSkill.equals(((AwakenBonus) obj).newSkill) && skillToBeReplaced.equals(((AwakenBonus) obj).skillToBeReplaced) &&
                    upgradedSkill.equals(((AwakenBonus) obj).upgradedSkill);
        }
    }
}
