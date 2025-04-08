package com.alex;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        boolean palindrome=false;

        for(int x = 0; x < s.length()-1; x++) {
            for(int y = x; y >= 0; y--) {
                String sub = s.substring(x-y, s.length()-(y));
                for(int i = 0; i < sub.length()/2; i++) {
                    if(sub.charAt(i) == sub.charAt(sub.length()-1-i)) {
                        palindrome=true;
                    }
                    else {
                        palindrome=false;
                        break;
                    }
                }
                if(palindrome) {
                    return sub;
                }
            }
        }
        if(s.length()>0) {
            return s.substring(0, 1);
        }
        return "";
    }
}
