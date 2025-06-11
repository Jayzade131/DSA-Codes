package org.main.binarySearch;

public class BsAlgo {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(8, arr));
    }

    public static int binarySearch(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
