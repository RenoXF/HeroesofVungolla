import java.io.Serializable;

public class SecondaryAwakenBonus extends AwakenBonus implements Serializable, Cloneable {
    /**
     * This class contains attributes of secondary awaken bonus gained for secondary awakening a character.
     */

    // Initialising private attributes of SecondaryAwakenBonus class.
    private Skill secondNewSkill;
    private Skill secondSkillToBeReplaced;
    private Skill secondUpgradedSkill;

    // Creating constructor of SecondaryAwakenBonus class
    public SecondaryAwakenBonus(double attackSpeedUp, double critRateUp, double critDamageUp, double evasionChanceUp,
                       double resistanceUp, double accuracyUp, double extraTurnChanceUp, double counterattackChanceUp,
                       Skill newSkill, Skill skillToBeReplaced, Skill upgradedSkill, Skill secondNewSkill,
                                Skill secondSkillToBeReplaced, Skill secondUpgradedSkill){
        super(attackSpeedUp, critRateUp, critDamageUp, evasionChanceUp, resistanceUp, accuracyUp, extraTurnChanceUp,
                counterattackChanceUp, newSkill, skillToBeReplaced, upgradedSkill);
        this.secondNewSkill = secondNewSkill;
        this.secondSkillToBeReplaced = secondSkillToBeReplaced;
        this.secondUpgradedSkill = secondUpgradedSkill;
    }

    public Skill getSecondNewSkill() {
        return secondNewSkill;
    }

    public void setSecondNewSkill(Skill secondNewSkill) {
        this.secondNewSkill = secondNewSkill;
    }

    public Skill getSecondSkillToBeReplaced() {
        return secondSkillToBeReplaced;
    }

    public void setSecondSkillToBeReplaced(Skill secondSkillToBeReplaced) {
        this.secondSkillToBeReplaced = secondSkillToBeReplaced;
    }

    public Skill getSecondUpgradedSkill() {
        return secondUpgradedSkill;
    }

    public void setSecondUpgradedSkill(Skill secondUpgradedSkill) {
        this.secondUpgradedSkill = secondUpgradedSkill;
    }
}
