package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class ConstructorDoesSomethingTest {

    @Test
    public void firstTest() {
        final ConstructorDoesSomething instance = new ConstructorDoesSomething(new NestedObject());
        final int result = instance.testingIsRequired();
        Assert.assertEquals(0, result);
    }

    @Test
    public void secondTest() {
        final ConstructorDoesSomethingService instance = new ConstructorDoesSomethingService();
        final int result = instance.getInt();
        Assert.assertEquals(0, result);
    }

}
