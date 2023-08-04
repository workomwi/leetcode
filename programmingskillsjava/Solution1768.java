package programmingskillsjava;

class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        var result = new StringBuilder();

        int i = 0;
        for (; i < Math.min(len1, len2); i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        while (i < len1) {
            result.append(word1.charAt(i++));
        }
        while (i < len2) {
            result.append(word2.charAt(i++));
        }
        
        return result.toString();
    }
}