package org.main.binarySearch;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {
       int[] arr = {2, 4, 5, 6, 4,3,1};
       peakIndexInMountainArray(arr);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;

            if ( arr[mid] > arr[mid + 1]) {
                end = mid;
            } else  {
                start = mid +1 ;
            }
        }

        return start;
    }
}
