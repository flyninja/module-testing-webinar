package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolation {

    private final OneObject oneObject;

    public LawOfDemeterViolation(OneObject oneObject) {
        this.oneObject = oneObject;
    }


    public int testingIsRequired(SecondObject o) {
        return 1 + oneObject.get(o.getFieldString());
    }

}
