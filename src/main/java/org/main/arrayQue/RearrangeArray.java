package org.main.arrayQue;

import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int i = 0;
        int j = 0;
        for (int n : nums) {
            if (n >= 0) {
                pos[i++] = n;
            } else {
                neg[j++] = n;
            }
        }
        for (int k = 0; k < nums.length / 2; k++) {
            nums[2 * k] = pos[k];
            nums[2 * k + 1] = neg[k];
        }
        return nums;
    }
}
