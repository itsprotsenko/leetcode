package com.alex;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[]{-1,-1};

        if(target < nums[0] || target > nums[nums.length-1])
            return new int[]{-1,-1};

        int l = 0, r = nums.length-1, lt=-1, rt=-1;

        if(nums[0] == target)
            lt = 0;
        if(nums[nums.length-1] == target)
            rt = nums.length-1;

        while(true) {
            int m = (l+r)/2;

            if(nums[m] == target) {
                if(lt == -1 && nums[m-1] != target)
                    lt = m;

                if(rt == -1 && nums[m+1] != target)
                    rt = m;

                int lr = m-1, rl = m+1;

                while(lt == -1) {
                    int lm = (l+lr)/2;

                    if(nums[lm] == target) {
                        if(nums[lm-1] != target)
                            lt = lm;
                        else
                            lr = lm-1;
                    } else {
                        if(nums[lm+1] == target)
                            lt = lm+1;
                        else
                            l = lm+1;
                    }
                }

                while(rt == -1) {
                    int rm = (r+rl)/2;

                    if(nums[rm] == target) {
                        if(nums[rm+1] != target)
                            rt = rm;
                        else
                            rl = rm+1;
                    } else {
                        if(nums[rm-1] == target)
                            rt = rm-1;
                        else
                            r = rm-1;
                    }
                }

                return new int[]{lt, rt};
            }

            if(nums[m] < target) {
                if(nums[m+1] > target)
                    return new int[]{-1, -1};
                l=m+1;
            }
            if(nums[m] > target) {
                if(nums[m-1] < target)
                    return new int[]{-1, -1};
                r=m-1;
            }
        }
    }
}
