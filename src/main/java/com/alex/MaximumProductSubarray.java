package com.alex;

import java.util.Arrays;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int prod = 1, prevprod = 0, max = nums[0], neg = 0, negs=0;
        boolean rev=false;

        for(int num : nums) {
            if(num > 0) {
                prod *= num;
                max = Math.max(max, prod);
            } else if(num < 0) {
                negs++;
                max = Math.max(max, num);
                if(prevprod == 0) {
                    prevprod = prod;
                    prod = 1;
                    neg = num;
                } else {
                    prod = prod * prevprod * num * neg;
                    prevprod = 0;
                    max = Math.max(max, prod);
                }
            } else {
                if(negs%2==1)
                    rev = true;
                negs=0;
                prod = 1;
                prevprod = 0;
                if(max<0)
                    max=0;
            }
        }

        if(rev || negs%2==1) {
            prod = 1;
            prevprod = 0;
            neg = 0;
            for(int i = nums.length-1; i >= 0; i--) {
                int num = nums[i];
                if(num > 0) {
                    prod *= num;
                    max = Math.max(max, prod);
                } else if(num < 0) {
                    max = Math.max(max, num);
                    if(prevprod == 0) {
                        prevprod = prod;
                        prod = 1;
                        neg = num;
                    } else {
                        prod = prod * prevprod * num * neg;
                        prevprod = 0;
                        max = Math.max(max, prod);
                    }
                } else {
                    prod = 1;
                    prevprod = 0;
                    if(max<0)
                        max=0;
                }
            }
        }

        return max;
    }
}
