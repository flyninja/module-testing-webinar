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

}
