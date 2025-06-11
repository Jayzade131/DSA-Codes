package org.main.binarySearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
      int[]  nums = {1,3,5,6} ;
      int target = 4;
        System.out.println( searchInsert(nums,target));

    }

    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int ans=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            ans= mid;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
