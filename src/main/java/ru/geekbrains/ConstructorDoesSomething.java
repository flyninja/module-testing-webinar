package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final INestedObject nestedObject;

    public ConstructorDoesSomething() {
        if (StaticObject.STATIC_INT == 0) {
            nestedObject = new NestedObject1();
        } else {
            nestedObject = new NestedObject2();
        }
    }


    public int testingIsRequired() {
        return nestedObject.getInt();
    }

}
