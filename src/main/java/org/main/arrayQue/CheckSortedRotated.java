package org.main.arrayQue;

public class CheckSortedRotated {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        boolean isSortedRotated = check(arr);
        System.out.println("Is the array sorted and rotated " + isSortedRotated);
    }
    public static boolean check(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1)% nums.length]) {
                count++;
            }
        }

        return count <= 1;
    }
}