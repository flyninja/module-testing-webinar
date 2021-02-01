package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolation {

    private final ThirdObject object;
    private final String key;

    public LawOfDemeterViolation(ThirdObject object, String key) {
        this.object = object;
        this.key = key;
    }


    public int testingIsRequired() {
        return object.doSomething(key);
    }

}
