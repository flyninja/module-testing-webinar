package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class OneObject {

    private SecondObject guardResource = new SecondObject();

    public int get() {
        return 1;
    }

    public SecondObject getGuardResource() {
        return guardResource;
    }
}
