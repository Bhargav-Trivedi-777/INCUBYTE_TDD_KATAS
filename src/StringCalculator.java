import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String inputValue) 
    {
        if(inputValue.equals(""))
        {
            return 0;
        }         
        StringTokenizer st1 = new StringTokenizer(inputValue,",");
        int sum=0;
        while(st1.hasMoreTokens())
        {
            String str=st1.nextToken();
            char ch=str.charAt(0);

            if(!Character.isDigit(ch))
            {
                int no=ch;
                sum+=(no-96);
            }
            else
            {
                sum+=Integer.parseInt(str);
            }
        }
        return sum;
    }
}
