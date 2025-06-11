package org.main.binarySearch;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        findInMountainArray(target, mountainArr);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {

        int end = peakIndexInMountainArray(mountainArr);
        int start = 0;
        int firstTry = binarySearchAsc(target, mountainArr, start, end);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearchDesc(target, mountainArr, start, end);
    }


    public static int binarySearchAsc(int target, int[] arr, int start, int end) {


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

    public static int binarySearchDesc(int target, int[] arr, int start, int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

}
