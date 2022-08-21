import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

    @Test
    public void hasTwoValues()
    {
        String inputValue = "1,30";
        int expectedValue = 31;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should return sum of both value seprated by , ",expectedValue, actualValue);
    }

    @Test
    public void hasTwoOrMoreValues()
    {
        String inputValue = "11,3,5,10";
        int expectedValue = 29;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should return sum of all given numbers",expectedValue, actualValue);
    }

    @Test
        public void hasAlphabateValue()
    {
        String inputValue = "z";
        int expectedValue = 26;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should return 1 if a given and 2 if b and so on",expectedValue, actualValue);
    }

    @Test
    public void hasAlphaNumericValue()
    {
        String inputValue = "1,2,a,3,c,b";
        int expectedValue = 12;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should return sum of all the int and alphabets according to Ascci",expectedValue, actualValue);
    }

    @Test
    public void shouldRaiseExceptionOnNegetiveValue()
    {
        String inputValue = "-1,-8,-7";
        try
        {
            StringCalculator.add(inputValue);
            
        }
        catch(RuntimeException ex)
        {
            System.out.println(ex.getMessage());
            assertEquals("Negative not allowed -1,-6,-7", ex.getMessage());
            fail("Exception");
        }
    }
}
