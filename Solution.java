import java.util.*;

public class Solution {

    public void moveZeroes(int[] nums) {
        int currentIndex = 0;
        int zeroIndex = -1;
        int zeroCount = 0;
        boolean sorted = false;
        for (int num : nums) {
            if (num == 0)
                zeroCount++;
        }
        if (zeroCount <= 0)
            return;
        if (zeroCount == nums.length)
            return;
        while (!sorted) {
            System.out.println(Arrays.toString(nums));
            if (nums[currentIndex] == 0)
                zeroIndex = currentIndex;
            if ((nums[currentIndex] != 0) && (zeroIndex != -1)) {
                nums[zeroIndex] = nums[currentIndex];
                nums[currentIndex] = 0;
                zeroIndex = -1;
            }

            for (int i = nums.length - zeroCount; i < nums.length; i++) {
                if (nums[i] != 0) {
                    sorted = false;
                    break;
                }

                if (i == nums.length - 1 && nums[i] == 0)
                    sorted = true;
            }

            if (currentIndex + 1 >= nums.length)
                currentIndex = 0;
            else
                currentIndex++;
        }
    }
}
