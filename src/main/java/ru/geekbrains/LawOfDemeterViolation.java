package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolation {

    private final OneObject oneObject;
    private final SecondObject secondObject;

    public LawOfDemeterViolation(OneObject oneObject, SecondObject secondObject) {
        this.oneObject = oneObject;
        this.secondObject = secondObject;
    }


    public int testingIsRequired() {
        ThirdObject o = secondObject.getObject();
        return o.doSomething(oneObject.get());
    }

}
