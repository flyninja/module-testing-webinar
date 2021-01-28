package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final NestedObject1 nestedObject1;

    private NestedObject2 nestedObject2;

    public ConstructorDoesSomething(NestedObject1 nestedObject1) {
        this.nestedObject1 = nestedObject1;
    }

    void initialize() {
        nestedObject2 = new NestedObject2(nestedObject1);
    }


    public int testingIsRequired() {
        return nestedObject2.getInt();
        // return 0;
    }

}
