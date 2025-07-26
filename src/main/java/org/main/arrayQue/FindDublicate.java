package org.main.arrayQue;

import java.util.HashSet;

public class FindDublicate {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n))
            {
                return n;
            }
            else{
             set.add(n);
            }
        }

        return 0;

    }


}
