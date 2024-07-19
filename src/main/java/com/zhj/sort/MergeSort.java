package com.zhj.sort;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月19日 11:14
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return; // 数组已经有序或为空，无需排序
        }

        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // 将数组拆分为左右两个子数组
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);

        // 递归排序左右子数组
        mergeSort(left);
        mergeSort(right);

        // 合并左右子数组
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
