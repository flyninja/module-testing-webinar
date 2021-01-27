package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vitaly Alekseev
 * @since 25.01.2021
 */
public class TddServiceTest {

    // Arrange
    private final TddService service = new TddService();

    @Test
    public void successTest() {
        // Act
        final String testResult = service.replaceOccurrences("test bla test", "bla", "lab", 1);
        // Assert
        Assert.assertEquals("test lab test", testResult);
    }

    @Test
    public void successNothingToReplaceTest() {
        final String testResult = service.replaceOccurrences("test bla test", "lab", "lab", 1);
        Assert.assertEquals("test bla test", testResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorSrcNullTest() {
        service.replaceOccurrences(null, "lab", "lab", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorWhatNullTest() {
        service.replaceOccurrences("test bla test", null, "lab", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorToNullTest() {
        service.replaceOccurrences("test bla test", "bla", null, 1);
    }

    @Test
    public void successLesserCountTest() {
        final String testResult = service.replaceOccurrences("test bla test", "bla", "lab", -1);
        Assert.assertEquals("test bla test", testResult);
    }

    @Test
    public void successGreaterCountTest() {
        final String testResult = service.replaceOccurrences("test bla test", "bla", "lab", 2);
        Assert.assertEquals("test lab test", testResult);
    }

    @Test
    public void successGreaterToReplaceTest() {
        final String testResult = service.replaceOccurrences("test bla bla test", "bla", "lab", 1);
        Assert.assertEquals("test lab bla test", testResult);
    }

}
