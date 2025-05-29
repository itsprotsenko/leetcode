package com.alex;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums[0]<nums[nums.length-1])
            return nums[0];
        if(nums[0]>nums[nums.length-1] && nums[nums.length-1]<nums[nums.length-2])
            return nums[nums.length-1];

        int start = 0, end = nums.length-1, mid = 0;

        while(true) {
            mid = (start + end)/2;
            if(nums[mid] > nums[mid+1])
                return nums[mid+1];
            if(nums[mid] < nums[mid-1])
                return nums[mid];
            if(nums[start] > nums[mid])
                end = mid;
            else
                start = mid;
        }
    }
}
