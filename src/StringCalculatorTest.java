import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class StringCalculatorTest {
    @Test
    public void isEmpty()
    {
        String inputValue ="";
        int expectedValue = 0;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should return 0 if the String is empty",expectedValue, actualValue);
    }

    @Test
    public void hasOneValue()
    {
        String inputValue = "12";
        int expectedValue = 12;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it shoud return 1 if one argument is passed",expectedValue, actualValue);
    }
}
