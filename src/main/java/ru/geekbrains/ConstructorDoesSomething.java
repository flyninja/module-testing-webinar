package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final INestedObject1 nestedObject1;

    private final INestedObject2 nestedObject2;

    public ConstructorDoesSomething(INestedObject1 nestedObject1, INestedObject2 nestedObject2) {
        this.nestedObject1 = nestedObject1;
        this.nestedObject2 = nestedObject2;
    }


    public int testingIsRequired() {
        return 0;
    }

}
