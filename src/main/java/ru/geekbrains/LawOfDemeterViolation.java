package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolation {

    public int testingIsRequired(ThirdObject thirdObject, String key) {
        return thirdObject.doSomething(key);
    }

}
