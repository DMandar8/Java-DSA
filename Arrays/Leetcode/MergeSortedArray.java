package Leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void slowMerge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;

        for (int j = m; j < nums1.length; j++) {
            nums1[j] = nums2[i];
            i++;
        }
        Arrays.sort(nums1);

    }

    public static void fastMerge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0; // for nums1
        int j = 0; // for nums2
        int[] arr = new int[nums1.length];
        int index = 0; // for arr

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                arr[index] = nums1[i];

                i++;
                index++;

            } else {
                arr[index] = nums2[j];

                j++;
                index++;
            }
        }

        while (i < m) {
            arr[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n) {
            arr[index] = nums2[j];
            j++;
            index++;
        }

        System.out.println(Arrays.toString(arr));

        //did this in leetcode due to return type   
        // for (int k = 0; k < nums1.length; k++) {
        //     nums1[k] = arr[k];
        // }
    }

    public static void main(String[] args) {

        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };

        int m = 3;
        int n = 3;

        // var startTime = System.nanoTime();
        // slowMerge(nums1, m, nums2, n);
        // var endTime = System.nanoTime();
        // System.out.println(Arrays.toString(nums1)+" time required:
        // "+(endTime-startTime));

        // var startTime = System.nanoTime();
        // nums1 = fastMerge(nums1, m, nums2, n);
        // var endTime = System.nanoTime();
        // System.out.println(Arrays.toString(nums1)+" time required:
        // "+(endTime-startTime));
        fastMerge(nums1, m, nums2, n);
    }
}