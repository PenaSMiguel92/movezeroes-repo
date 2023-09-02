
public class Solution {

    public void moveZeroes(int[] nums) {
        int zeroIndex = nums.length - 1;
        int currentIndex = zeroIndex - 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0)
                zeroCount++;
        }
        if (zeroCount <= 0)
            return;
        if (zeroCount == nums.length)
            return;
        while (zeroIndex >= nums.length - zeroCount) {
            if (nums[zeroIndex] == 0) {
                zeroIndex--;
                currentIndex = zeroIndex - 1;
            }
            if (nums[currentIndex] == 0 && nums[zeroIndex] != 0) {
                nums[currentIndex] = nums[zeroIndex];
                nums[zeroIndex] = 0;
                zeroIndex--;
                currentIndex = zeroIndex - 1;
            }
            currentIndex = currentIndex - 1 >= 0 ? currentIndex - 1 : zeroIndex - 1;
            
        }
    }
}
