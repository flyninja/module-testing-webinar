package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class StaticsConsumerExampleTest {

    @Test
    public void successTest() {
        final int result = new StaticsConsumerExample().testingIsRequired(new Stub());
        Assert.assertEquals(0, result);
    }

    public static class Stub implements IStaticWrapper {

        @Override
        public int getInt() {
            return 0;
        }
    }
}
