package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolation {

    public int testingIsRequired(ContextObject contextObject) {
        ThirdObject o = contextObject.getSecondObject().getObject();
        return o.doSomething(contextObject.get());
    }

}
