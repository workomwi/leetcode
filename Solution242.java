import java.util.HashMap;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var letters = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!letters.containsKey(letter)) {
                letters.put(letter, 1);
            } else {
                letters.put(letter, letters.get(letter) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            if (letters.containsKey(letter) && letters.get(letter) > 0) {
                letters.put(letter, letters.get(letter) - 1);                
            } else {
                return false;
            }
        }

        return true;
    }
}
