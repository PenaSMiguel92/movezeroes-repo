
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
            if (zeroIndex - 1 >= 0) {
                if (nums[zeroIndex] == 0) {
                    zeroIndex--;
                    currentIndex = zeroIndex - 1;
                } else if (nums[zeroIndex] != 0 && nums[currentIndex] == 0) {
                    for (int i = currentIndex; i < zeroIndex; i++) {
                        nums[i] = nums[i + 1];
                        nums[i + 1] = 0;
                    }
                    zeroIndex--;
                    currentIndex = zeroIndex - 1;
                }
            } else {
                break;
            }
                
           
            currentIndex = currentIndex - 1 >= 0 ? currentIndex - 1 : zeroIndex - 1;
            
        }
    }
}
