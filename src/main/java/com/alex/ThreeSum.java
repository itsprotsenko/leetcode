package com.alex;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        if (nums[0] == 0 && nums[nums.length - 1] == 0) {
            res.add(Arrays.stream(new int[]{0, 0, 0}).boxed().collect(Collectors.toList()));
            return res;
        }

        if (nums[nums.length - 1] < 0 || nums[0] > 0) {
            return res;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;

            int j = i + 1;
            int k = nums.length - 1;
            int t = -nums[i];

            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum > t)
                    k--;
                else if (sum < t)
                    j++;
                else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                    while (j < k && nums[j - 1] == nums[j]) {
                        j++;
                    }
                }
            }
        }

        return res;
    }
}