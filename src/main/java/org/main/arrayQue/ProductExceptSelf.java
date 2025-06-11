package org.main.arrayQue;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int product = 1;

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (j != i) {
                    product *= nums[i];
                }


            }
            arrayList.add(product);
            product = 1;
        }

        return arrayList.stream().mapToInt(i -> i).toArray();

    }
}
