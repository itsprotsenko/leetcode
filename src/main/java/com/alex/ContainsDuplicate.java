package com.alex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(!set.add(num)) return true;

        }

        return false;

//        HashSet<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
//
//        return set.size() != nums.length;
    }
}
