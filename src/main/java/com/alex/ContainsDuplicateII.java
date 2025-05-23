package com.alex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int j = 0;
        for(int i : nums) {
            if(!set.add(i))
                return true;

            if(set.size()>k) {
                set.remove(nums[j]);
                j++;
            }

        }

        return false;


//        for(int i = 0; i < nums.length-1; i++) {
//            for(int j = i+1; j < Math.min(nums.length, i+k+1); j++) {
//                if(nums[i] == nums[j]) return true;
//            }
//        }
//        return false;

    }
}
