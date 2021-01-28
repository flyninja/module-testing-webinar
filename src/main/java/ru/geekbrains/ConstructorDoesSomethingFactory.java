package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomethingFactory {

    public ConstructorDoesSomething createInstance(NestedObject1 nestedObject1) {
        return new ConstructorDoesSomething(new NestedObject2(nestedObject1));
    }
}
