import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String inputValue) 
    {
        if(inputValue.equals(""))
        {
            return 0;
        }         
        StringTokenizer st1 = new StringTokenizer(inputValue,",\n");
        int sum=0;
        String tmp = "";
        while(st1.hasMoreTokens())
        {
            String str=st1.nextToken();
            char ch=str.charAt(0);

            if((!Character.isDigit(ch))&&(str.length()==1))
            {
                int no=ch;
                sum+=(no-96);
            }
            else if(Integer.parseInt(str) < 0)
            {
                tmp += str+",";
            }
            else
            {
                if(!(Integer.parseInt(str) > 1000))
                {
                    sum+=Integer.parseInt(str);
                }
            }   
        }
        if(tmp.length()!=0)
        {
            throw new RuntimeException("Negative not allowed "+tmp); 
        }
         return sum;
    }
}
