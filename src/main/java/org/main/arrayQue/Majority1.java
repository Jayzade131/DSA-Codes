package org.main.arrayQue;

import java.util.HashMap;

public class Majority1 {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int major = 0;

        for (int num : nums) {

            map.put(num, 1 + map.getOrDefault(num, 0));
            if(map.get(num)>major)
            {
                result=num;
                major=map.get(num);
            }


        }
        return result;
    }
}
