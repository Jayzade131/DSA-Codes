package org.main.arrayQue;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,-1};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int i = 0;
        int max = nums[0];
        while (i < nums.length) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                max = Math.max(sum, max);
            }
            i++;
            sum = 0;
        }
        return max;
    }
}
