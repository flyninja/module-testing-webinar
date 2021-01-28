package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomethingTest {

    @Test
    public void successTest() {
        final ConstructorDoesSomething instance = new ConstructorDoesSomething(new NestedObject1());
        final int result = instance.testingIsRequired();
        Assert.assertEquals(0, result);
    }

}
