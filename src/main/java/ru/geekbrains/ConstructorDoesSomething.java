package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final NestedObject2 nestedObject2;

    public ConstructorDoesSomething(NestedObject2 nestedObject2) {
        this.nestedObject2 = nestedObject2;
    }


    public int testingIsRequired() {
        return nestedObject2.getInt();
        // return 0;
    }

}
