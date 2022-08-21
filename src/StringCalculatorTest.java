import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
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
        Exception e=assertThrows(Exception.class, ()->StringCalculator.add("-1"));
        assertEquals("Negative not allowed -1,",e.getMessage());
    }

    @Test
    public void shouldRaiseExceptionOnMultipleNegetiveValue()
    {
        Exception e=assertThrows(Exception.class, ()->StringCalculator.add("-1,-6,4,-8"));
        assertEquals("Negative not allowed -1,-6,-8,",e.getMessage());
    }

    @Test
    public void hasMoreThanThosandValue()
    {   
        String inputValue = "2000,2,1001";
        int expectedValue = 2;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should ignore the value which grater then 1000",expectedValue,actualValue);
    }

    @Test
    public void shouldAllowNewLine()
    {
        String inputValue = "1,2,a,3\n4";
        int expectedValue = 11;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should all the new line character and return the sum of all",expectedValue, actualValue);
    }
     @Test
    public void shouldAllowDelimiter()
    {
        String inputValue = "//;\n1;2";
        int expectedValue = 3;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should all the new line character and return the sum of all",expectedValue, actualValue);
    }

    @Test
    public void shouldAllowOddAddtion()
    {
        String inputValue= "0//***\n1***2***3";
        int expectedValue = 2;
        int actualValue = StringCalculator.add(inputValue);
        assertEquals("it should return sum of all odd values",expectedValue, actualValue);
    }

}
