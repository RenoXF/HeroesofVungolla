import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class MainFunctions {
    /**
     * This class contains attributes of reusable main functions of the program.
     */

    public BigInteger factorial(int n){
        if (n < 0){
            return new BigInteger("0");
        }
        else if (n == 0 || n == 1){
            return new BigInteger("1");
        }
        BigInteger result = new BigInteger("1");
        for (int i = 1; i < n; i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }

    public <T extends Number> BigDecimal sumOfList(ArrayList<T> numList) {
        BigDecimal sum = new BigDecimal("0"); // initial value
        for (T number : numList) {
            sum = sum.add(new BigDecimal(number.toString()));
        }
        return sum;
    }

    public <T extends Number> BigDecimal sumOfList(T[] numList) {
        BigDecimal sum = new BigDecimal("0"); // initial value
        for (T number : numList) {
            sum = sum.add(new BigDecimal(number.toString()));
        }
        return sum;
    }

    public <T extends Number> BigDecimal productOfList(ArrayList<T> numList) {
        BigDecimal prod = new BigDecimal("1"); // initial value
        for (T number : numList) {
            prod = prod.multiply(new BigDecimal(number.toString()));
        }
        return prod;
    }

    public <T extends Number> BigDecimal productOfList(T[] numList) {
        BigDecimal prod = new BigDecimal("1"); // initial value
        for (T number : numList) {
            prod = prod.multiply(new BigDecimal(number.toString()));
        }
        return prod;
    }

    public <T extends Number> BigDecimal getMaxOfList(ArrayList<T> numList) {
        if (numList.size() > 0) {
            BigDecimal max = new BigDecimal(numList.get(0).toString());
            for (T number : numList) {
                if (new BigDecimal(number.toString()).compareTo(max) > 0) {
                    max = new BigDecimal(number.toString());
                }
            }
            return max;
        }
        return null;
    }

    public <T extends Number> BigDecimal getMaxOfList(T[] numList) {
        if (numList.length > 0) {
            BigDecimal max = new BigDecimal(numList[0].toString());
            for (T number : numList) {
                if (new BigDecimal(number.toString()).compareTo(max) > 0) {
                    max = new BigDecimal(number.toString());
                }
            }
            return max;
        }
        return null;
    }

    public Skill getSkillByID(String skillID, ArrayList<Skill> skills) {
        for (Skill skill : skills) {
            if (skill.getSkillID().equals(skillID)) {
                return skill;
            }
        }
        return null;
    }

    public Skill getSkillByID(String skillID, Skill[] skills) {
        for (Skill skill : skills) {
            if (skill.getSkillID().equals(skillID)) {
                return skill;
            }
        }
        return null;
    }

    public <T extends Object> int getIndex(T elem, ArrayList<T> aList) {
        int index = 0; // initial value
        for (T currElem : aList) {
            if (currElem.equals(elem)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public <T extends Object> int getIndex(T elem, T[] aList) {
        int index = 0; // initial value
        for (T currElem : aList) {
            if (currElem.equals(elem)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
