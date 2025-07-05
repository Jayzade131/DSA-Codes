package org.main.other;

import java.util.Arrays;

public class QuickSortAlgo {
    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int parti = parti(arr, low, high);
            quickSort(arr, low, parti - 1);
            quickSort(arr, parti + 1, high);
        }

    }

    public static int parti(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }

        }
        swap(arr, low, j);

        return j;

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
