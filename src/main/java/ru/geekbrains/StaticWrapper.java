package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class StaticWrapper implements IStaticWrapper {

    @Override
    public int getInt() {
        return Statics.getInt();
    }
}
