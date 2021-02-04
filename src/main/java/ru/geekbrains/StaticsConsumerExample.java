package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class StaticsConsumerExample {

    public int testingIsRequired(IStaticWrapper staticWrapper) {
        return staticWrapper.getInt();
    }

}
