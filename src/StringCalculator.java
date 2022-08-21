import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String inputValue) {
        StringTokenizer st1;
        String currentOrder = "default";
        int currentIndex = -1;
        if (inputValue.equals("")) {
            return 0;
        }

        if (inputValue.startsWith("0//")) {
            inputValue = inputValue.substring(1, inputValue.length());
            currentOrder = "odd";
        }
        if (inputValue.startsWith("1//")) {
            inputValue = inputValue.substring(1, inputValue.length());
            currentOrder = "even";
        }

        if (inputValue.startsWith("//")) {
            String str1 = inputValue;

            int pre = str1.indexOf("//");
            int end = str1.indexOf("\n");

            String delimiter = str1.substring(pre + 2, end);

            String trimmedStr = str1.substring(end + 1);
            st1 = new StringTokenizer(trimmedStr, delimiter);
        } else {
            st1 = new StringTokenizer(inputValue, ",\n");
        }
        int sum = 0;
        String tmp = "";
        while (st1.hasMoreTokens()) {
            currentIndex++;
            String str = st1.nextToken();
            if (currentOrder.equals("odd") && currentIndex % 2 == 0) {
                continue;
            }
            if (currentOrder.equals("even") && currentIndex % 2 != 0) {
                continue;
            }
            char ch = str.charAt(0);

            if ((!Character.isDigit(ch)) && (str.length() == 1)) {
                int no = ch;
                sum += (no - 96);
            } else if (Integer.parseInt(str) < 0) {
                tmp += str + ",";
            } else {
                if (!(Integer.parseInt(str) > 1000)) {
                    sum += Integer.parseInt(str);
                }
            }
        }
        if (tmp.length() != 0) {
            throw new RuntimeException("Negative not allowed " + tmp);
        }
        return sum;
    }
}
