package org.main.arrayQue;

public class RotateArray {

    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

    }

//    public static void rotate(int[] nums, int k) {
//        int i=0;
//        while (i<=k)
//        {
//            int temp=nums[0];
//            for (int j = 1; j < nums.length; j++) {
//                    nums[j-1]=nums[j];
//            }
//            nums[nums.length-1]=temp;
//            i++;
//        }
//    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
