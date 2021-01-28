package ru.geekbrains;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomethingFactory {

    public ConstructorDoesSomething createInstance() {
        if (StaticObject.STATIC_INT == 0) {
            return new ConstructorDoesSomething(new NestedObject1());
        } else {
            return new ConstructorDoesSomething(new NestedObject2());
        }
    }

}
