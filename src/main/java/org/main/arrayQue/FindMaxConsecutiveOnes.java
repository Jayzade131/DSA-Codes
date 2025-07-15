package org.main.arrayQue;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;


        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
