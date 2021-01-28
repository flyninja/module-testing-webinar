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
        final ConstructorDoesSomething instance = new ConstructorDoesSomething(new StubNestedObject2(new StubNestedObject1()));
        final int result = instance.testingIsRequired();
        Assert.assertEquals(0, result);
    }

    public static class StubNestedObject2 extends NestedObject2 {

        public StubNestedObject2(NestedObject1 nestedObject1) {
            super(nestedObject1);
        }

    }

    public static class StubNestedObject1 extends NestedObject1 {

    }
}
