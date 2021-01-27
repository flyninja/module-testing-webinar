package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final NestedObject nestedObject;

    public ConstructorDoesSomething(NestedObject nestedObject) {
        this.nestedObject = nestedObject;
    }


    public int testingIsRequired() {
        return 0;
    }

}
