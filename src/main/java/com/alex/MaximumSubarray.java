package com.alex;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int start = 0, end = nums.length-1, max = nums[0];
        while(nums[start] < 0 && end !=start) {
            if (nums[start] > max)
                max = nums[start];
            start++;
        }

        if(start == end) {
            max = Math.max(max, nums[start]);
            return max;
        }

        while(nums[end] < 0) {
            if (nums[end] > max)
                max = nums[start];
            end--;
        }
        if(start == end) {
            max = Math.max(max, nums[start]);
            return max;
        }

        int sum = 0;
        for(int i = 0; i+start <= end; i++) {
            sum += nums[start+i];
            max = Math.max(max, sum);
            if(sum < 0) {
                sum = 0;
                start = start+i+1;
                i=-1;
            }
        }

        return max;
    }
}
