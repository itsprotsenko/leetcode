package com.alex;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];

        int x=0, y=0;
        for(int i = 0; i < nums.length; i++) {
            if(x<nums1.length && (y==nums2.length || nums1[x]<=nums2[y])) {
                nums[i] = nums1[x];
                x++;
            }
            else {
                nums[i] = nums2[y];
                y++;
            }
        }

        if(nums.length % 2 == 0) {
            return (double) (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) /2;
        }
        else {
            return nums[nums.length / 2];
        }
    }
}
