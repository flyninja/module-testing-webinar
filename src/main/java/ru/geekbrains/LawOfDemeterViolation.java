package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolation {

    private final OneObject oneObject;
    private final SecondObject guard;

    public LawOfDemeterViolation(OneObject oneObject, SecondObject secondObject) {
        this.oneObject = oneObject;
        guard = secondObject;
    }


    public int testingIsRequired() {
        guard.acquire();
        try {
            return 1 + oneObject.get();
        } finally {
            guard.release();
        }
    }

}
