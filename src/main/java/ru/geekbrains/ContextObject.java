package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ContextObject {

    public String get() {
        return "qqq";
    }

    public SecondObject getSecondObject() {
        return new SecondObject();
    }

}
