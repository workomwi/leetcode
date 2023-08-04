package programmingskillsjava;

import java.util.HashMap;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> letters = new HashMap<>();
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
                return letter;
            }
        }
        return 'l';
    }
}
