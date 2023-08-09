public class Solution459 {
    public boolean isConstructedWithSubstring(String str, String substr) {
        int strLen = str.length();
        int substrLen = substr.length();
        if (strLen % substrLen != 0) {
            return false;
        }

        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) != substr.charAt(i % substrLen)) {
                return false;
            }
        }

        return true;
    }


    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if (len < 2) {
            return false;
        }

        for (int substrLen = 1; substrLen < len; substrLen++) {
            if (len % substrLen != 0) {
                continue;
            }
            if (isConstructedWithSubstring(s, s.substring(0, substrLen))) {
                return true;
            }

        }

        return false;
    }
}
