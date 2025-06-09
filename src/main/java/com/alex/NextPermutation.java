package com.alex;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
         for(int i = nums.length-1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                for(int j = i; j <nums.length; j++) {
                    if(nums[j] <= nums[i-1]) {
                        int temp = nums[i-1];
                        nums[i-1] = nums[j-1];
                        nums[j-1] = temp;
                        break;
                    }
                    if(j == nums.length-1) {
                        int temp = nums[i-1];
                        nums[i-1] = nums[j];
                        nums[j] = temp;
                    }
                }
                if(i!=nums.length-1) {
                    for(int j = 0; i+2*j < nums.length-1; j++) {
                        int temp = nums[i+j];
                        nums[i+j] = nums[nums.length-1-j];
                        nums[nums.length-1-j] = temp;
                    }
                }
                return;
            }
        }
        Arrays.sort(nums);
    }
}
