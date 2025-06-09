package com.alex;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;

        int i = 1, j=0, n = nums.length;
        while(i+j<nums.length) {
            while(nums[i+j] == nums[i-1]) {
                j++;
                n--;
                if(i+j==nums.length)
                    return n;
            }
            if(j!=0)
                nums[i] = nums[j+i];
            i++;
        }

        return n;
    }
}
