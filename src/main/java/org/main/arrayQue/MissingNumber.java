package org.main.arrayQue;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
      int[]  nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
    int miss = 0;
        for (int j = 0; j <=nums.length ; j++) {
            if (!set.contains(j))
            {
                miss=j;
            }
        }

    return miss;
    }
}
