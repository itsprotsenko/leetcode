package com.alex;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater {
    public int trap(int[] height) {
        if(height.length < 3)
            return 0;

        int l = 0, r = height.length - 1, sum = 0;

        while(height[r] <= height[r-1]) {
            r--;
            if(r == 1)
                return 0;
        }

        while(height[l] <= height[l+1]) {
            l++;
            if(l == r-1)
                return 0;
        }

        while(l < r-1) {
            int hr = height[r], hl = height[l];
            if(height[l] > height[r]) {
                r--;
                while(hr >= height[r]) {
                    sum += hr - height[r];
                    r--;
                    if(r == l)
                        return sum;
                }
            } else {
                l++;
                while(hl >= height[l]) {
                    sum += hl - height[l];
                    l++;
                    if(r == l)
                        return sum;
                }
            }
        }

        return sum;
    }
}
