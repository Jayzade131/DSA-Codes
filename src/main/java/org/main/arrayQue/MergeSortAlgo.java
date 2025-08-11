package org.main.arrayQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortAlgo {

    public static void main(String[] args) {
        int[] arr = {12, 31, 35, 8, 32, 17};

        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr,start,mid,end);


        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();

        int i = start;
        int j = mid + 1;

        // Merge the two halves
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        // Copy remaining elements from right half
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        // Copy back to original array
        for (int k = 0; k < temp.size(); k++) {
            arr[start + k] = temp.get(k);
        }
    }
}
