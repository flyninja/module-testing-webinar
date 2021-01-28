package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomething {

    private final int staticInt;

    public ConstructorDoesSomething(int staticInt) {

        this.staticInt = staticInt;
    }


    public int testingIsRequired() {
        return staticInt;
    }

}
