public class Solution283 {
    public void moveZeroes(int[] nums) {
        int zeroesCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroesCount++;
                continue;
            }
            nums[i-zeroesCount] = nums[i];
        }

        for (int i = nums.length - 1; i > nums.length - 1 - zeroesCount; i--) {
            nums[i] = 0;
        }
    }
}
