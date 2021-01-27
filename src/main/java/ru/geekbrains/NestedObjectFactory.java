package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class NestedObjectFactory {

    private static final NestedObjectFactory instance;

    static {
        instance = new NestedObjectFactory();
        instance.nestedObject.setFieldInt(3);
        instance.nestedObject.setFieldString("222");
    }

    public static NestedObjectFactory getInstance() {
        return instance;
    }

    private final NestedObject nestedObject = new NestedObject();

    public NestedObject getNestedObject() {
        return nestedObject;
    }

}
