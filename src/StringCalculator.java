import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String inputValue) 
    {
        if(inputValue.equals(""))
        {
            return 0;
        } 
        if(!Character.isDigit(inputValue.charAt(0)))
        {
            int character = inputValue.charAt(0);
            return character - 96;
        }
        
        StringTokenizer st = new StringTokenizer(inputValue,",");
        int sum = 0;
        if(st.countTokens() == 1)
        {
            return Integer.parseInt(inputValue);
        }
        else if(st.countTokens() == 2)
        {
            while(st.hasMoreTokens())
            {
                sum += Integer.parseInt(st.nextToken());
            }
            return sum;
        }
        else if(st.countTokens() == 2 || st.countTokens() > 1)
        {
            sum = 0;
            while(st.hasMoreTokens())
            {
                sum += Integer.parseInt(st.nextToken());
            }
            return sum;
        }
        return -1;
    }
}
