import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String inputValue) 
    {
        if(inputValue.equals(""))
        {
            return 0;
        } 
        
        StringTokenizer st = new StringTokenizer(inputValue,",");
        if(st.countTokens() == 1)
        {
            return Integer.parseInt(inputValue);
        }
        else if(st.countTokens() == 2)
        {
            int sum = 0;
            while(st.hasMoreTokens())
            {
                sum += Integer.parseInt(st.nextToken());
            }
            return sum;
        }
        return -1;
    }
}
