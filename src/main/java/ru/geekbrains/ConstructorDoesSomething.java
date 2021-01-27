package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final NestedObject1 nestedObject1 = new NestedObject1();

    private final NestedObject2 nestedObject2;

    public ConstructorDoesSomething() {
        nestedObject2 = new NestedObject2();
    }


    public int testingIsRequired() {
        return 0;
    }

}
