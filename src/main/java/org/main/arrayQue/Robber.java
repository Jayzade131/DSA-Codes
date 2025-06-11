package org.main.arrayQue;

public class Robber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum1 += nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                sum2 += nums[i];
            }
        }
        return Math.max(sum1, sum2);
    }
}