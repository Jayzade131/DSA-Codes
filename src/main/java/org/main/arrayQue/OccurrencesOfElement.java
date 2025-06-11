package org.main.arrayQue;

import java.util.ArrayList;
import java.util.Arrays;

public class OccurrencesOfElement {

    public static void main(String[] args) {

        int[] nums = {1, 3, 1, 7};
        int[] queries = {1, 3, 2, 4};
        int x = 1;

        System.out.println(Arrays.toString(occurrencesOfElement(nums, queries, x)));

    }

    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        ArrayList<Integer> occ = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                occ.add(i);
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            if (q <= occ.size()) {
                result[i] = occ.get(q - 1);
            } else {
                result[i] = -1;
            }
        }


        return result;


    }
}
