package com.alex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=k) {
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                if(!set.add(num)) return true;
            }
            return false;
        }

        LinkedList<Integer> set = new LinkedList<>();

        for(int num : Arrays.copyOf(nums, k+1)) {
            if(set.contains(num)) return true;
            else set.add(num);
        }
        for(int num : Arrays.copyOfRange(nums, k+1, nums.length)) {
            set.remove();
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}
