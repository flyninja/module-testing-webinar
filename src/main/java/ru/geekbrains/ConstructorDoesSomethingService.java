package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomethingService {

    private ConstructorDoesSomething instance = new ConstructorDoesSomething();

    public int getInt() {
        return instance.testingIsRequired();
    }

}
