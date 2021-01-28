package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final int staticInt;

    public ConstructorDoesSomething() {
        staticInt = StaticObject.STATIC_INT;
    }


    public int testingIsRequired() {
        return staticInt;
    }

}
