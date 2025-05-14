package com.alex;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerATOI {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        StringBuilder ans = new StringBuilder();

        if(s.charAt(0) == '-') {
            ans.append('-');
            s=s.substring(1);
        } else if(s.charAt(0) == '+') s=s.substring(1);


        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                ans.append(c);
            } else break;
        }

        if(!ans.isEmpty() && !(ans.toString()).equals("-")) {
            try {
                return Integer.parseInt(ans.toString());
            } catch (NumberFormatException e) {
                if(ans.charAt(0) == '-') return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}
