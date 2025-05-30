package com.alex;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums[nums.length-1]==target)
            return nums.length-1;
        if(nums[0]==target)
            return 0;

        if(nums.length<=2)
            return -1;

        if(nums[0]>target && nums[nums.length-1]<target)
            return -1;

        if(nums[0]<nums[nums.length-1] && (nums[0]>target || nums[nums.length-1]<target))
            return -1;

        int start = 0, end = nums.length-1, mid = 0;

        while(true) {
            mid = (start + end)/2;

            if(nums[mid]==target)
                return mid;

            if(nums[mid-1]<target && nums[mid]>target)
                return -1;
            if(nums[mid+1]>target && nums[mid]<target)
                return -1;

            if(nums[mid+1]<nums[mid] && nums[mid]<target)
                return -1;
            if(nums[mid-1]>nums[mid] && nums[mid]>target)
                return -1;

            if(nums[mid-1]==target)
                return mid-1;
            if(nums[mid+1]==target)
                return mid+1;

            if(mid-1==0)
                return -1;
            if(mid+1==nums.length-1)
                return -1;

            if((nums[mid]<nums[start] && target>nums[start]) || (nums[start]<target && target<nums[mid]) || (target<nums[mid] && nums[mid]<nums[start]))
                end = mid;
            else
                start = mid;
        }
    }
}
