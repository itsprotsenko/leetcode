package com.alex;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int x = s.length()-1;
        int len=0;
        while(s.charAt(x)==' ') {
            if(x<=0) {
                return 0;
            }
            x--;
        }
        if(x==0) return 1;
        while(x>-1 && s.charAt(x)!=' ' ) {
            len++;
            x--;
        }
        return len;
    }
}
