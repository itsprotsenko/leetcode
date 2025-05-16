package com.alex;

import java.util.Arrays;

public class ContainerWithMostWater {

    //Attempted, time limit exceeded

    public int maxArea(int[] height) {
        if(height.length==2) return Math.min(height[0],height[1]);
        boolean changed = true;
        int len = height.length-1, l = height[0], r = height[len], area = len*Math.min(l, r), li=0, ri=len, areaMax = (len-1)*Math.max(l, r);

        while(areaMax > area && changed) {
            changed = false;
            if(area < (len-1)*Math.min(l, height[ri-1])) {
                ri--;
                r = height[ri];
                len--;
                area = len*Math.min(l, r);
                areaMax = (len-1)*Math.max(l, r);
                changed = true;
            }
            else if(area < (len-1)*Math.min(r, height[li+1])) {
                li++;
                l = height[li];
                len--;
                area = len*Math.min(l, r);
                areaMax = (len-1)*Math.max(l, r);
                changed = true;
            }
        }
//        int i=li;
//        while(i != ri) {
//            i++;
//            if(Math.min(height[i], height[ri])*(ri-i) > area) area = Math.min(height[i], height[ri]);
//        }
//        i=ri;
//        while(i != li) {
//            i--;
//            if(Math.min(height[i], height[li])*(i-li) > area) area = Math.min(height[i], height[ri]);
//        }

        if(ri-li>1) {
            int rArea = 0;

            if(area < rArea) area = rArea;

            rArea = maxArea(Arrays.copyOfRange(height, li+1, ri+1));

            if(area < rArea) area = rArea;
        }

        return area;
    }
}
