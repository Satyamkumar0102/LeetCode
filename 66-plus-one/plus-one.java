import java.math.BigInteger;

class Solution {
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        BigInteger number = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        for (int i =0;i<n;i++)
        {
            BigInteger single = new BigInteger(String.valueOf(digits[i]));
            number = number.multiply(ten);
            number = number.add(single);
        }
        number = number.add(new BigInteger("1"));
        int len = number.toString().length();
        BigInteger reminder = new BigInteger("0");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < len; i++) {
            reminder = new BigInteger(String.valueOf(number.remainder(ten)));
            number = number.divide(ten);
            answer.append(reminder.intValue());
        }
        int result[] = new int[len];
        answer = answer.reverse();
        for (int i = 0; i < answer.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(answer.charAt(i)));
        }
        return result;
    }
}