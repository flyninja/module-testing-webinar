package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final INestedObject nestedObject;

    public ConstructorDoesSomething(INestedObject nestedObject) {
        this.nestedObject = nestedObject;
    }


    public int testingIsRequired() {
        return nestedObject.getInt();
    }

}
