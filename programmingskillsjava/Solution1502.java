package programmingskillsjava;

import java.util.Arrays;
import java.util.Collection;

public class Solution1502 {
    // O(nlogn)
    // public boolean canMakeArithmeticProgression(int[] arr) {
    //     Arrays.sort(arr);
    //     int diff = arr[1] - arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] - arr[i - 1] != diff) return false;
    //     } 
    //     return true;
    // }

    // O(n)
    public boolean canMakeArithmeticProgression(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        if (max == min) return true;
        int diff = (max - min) / (arr.length - 1);
        if (diff == 0) return false;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - min) % diff != 0) return false;
            if (arr[i] == min + diff * i) continue;
            int targetPos = (arr[i] - min) / diff;
            if (targetPos >= arr.length || arr[targetPos] == arr[i]) return false;
            int temp = arr[i];
            arr[i] = arr[targetPos];
            arr[targetPos] = temp;
        }
        return true;
    }
}
