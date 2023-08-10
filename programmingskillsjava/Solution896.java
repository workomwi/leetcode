package programmingskillsjava;

public class Solution896 {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) return true;

        boolean isIncreasing = true;
        boolean isDefined = false;

        
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1];
            if (diff == 0) continue;
            if (!isDefined) {
                isIncreasing = diff > 0;
                isDefined = true;
            }
            if (isDefined && isIncreasing != diff > 0) {
                return false;
            }
        }

        return true;        
    }
}
