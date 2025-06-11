package com.alex;

public class ClimbingStairs {
    public int climbStairs(int n) {
        double phi = (1+Math.sqrt(5))/2;
        return (int)Math.round((Math.pow(phi,n+1)-Math.pow(phi,-1*(n+1)))/Math.sqrt(5));
    }
}
