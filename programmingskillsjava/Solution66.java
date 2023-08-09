package programmingskillsjava;
import java.util.Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        result[0] = 0;
        int remainder = 0;
        for (int i = digits.length; i > 0; i--) {
            if (i == digits.length) {
                result[i] = digits[i-1] + 1;
            } else {
                result[i] = digits[i-1] + remainder;
                remainder = 0;
            }

            if (result[i] > 9) {
                result[i] -= 10;
                remainder = 1;
            }
        }
        result[0] = remainder;
        if (result[0] == 0) return Arrays.copyOfRange(result, 1, result.length);
        return result;
    }
}
