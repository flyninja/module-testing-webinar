package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vitaly Alekseev
 * @since 28.01.2021
 */
public class LawOfDemeterViolationTest {

    @Test
    public void successTest() {
        final LawOfDemeterViolation instance = new LawOfDemeterViolation(new ThirdObject(), "kkk");
        final int result = instance.testingIsRequired();
        Assert.assertEquals(0, result);
    }

}
