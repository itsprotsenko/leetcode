package com.alex;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;

        while(x!=0) {
            try {
                rev = Math.multiplyExact(rev, 10);
            } catch (ArithmeticException e) {
                return 0;
            }
            rev+=x%10;
            x /= 10;
        }

        return rev;
    }
}
