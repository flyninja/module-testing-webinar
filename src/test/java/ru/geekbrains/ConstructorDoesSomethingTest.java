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
        final INestedObject1 n1 = new StubNestedObject1();
        final INestedObject2 n2 = new StubNestedObject2();
        final ConstructorDoesSomething instance = new ConstructorDoesSomething(n1, n2);
        final int result = instance.testingIsRequired();
        Assert.assertEquals(0, result);
    }

    private static class StubNestedObject1 implements INestedObject1 {

    }

    private static class StubNestedObject2 implements INestedObject2 {

    }
}
