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
        final int result = new LawOfDemeterViolation().testingIsRequired(new ContextObject.Builder().key("ddd").secondObject(new SecondObject()).build());
        Assert.assertEquals(0, result);
    }

}
