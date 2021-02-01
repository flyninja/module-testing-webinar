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


    public int testingIsRequired() {
        SecondObject guard = oneObject.getGuardResource();
        guard.acquire();
        try {
            return 1 + oneObject.get();
        } finally {
            guard.release();
        }
    }

}
