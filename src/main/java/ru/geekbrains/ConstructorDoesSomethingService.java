package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomethingService {

    private final ConstructorDoesSomething instance;

    public ConstructorDoesSomethingService(ConstructorDoesSomething instance) {
        this.instance = instance;
    }

    public int getInt() {
        return instance.testingIsRequired();
    }

}
