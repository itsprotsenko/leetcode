package com.alex;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int pos=numRows-2, counter=-1;
        String[] rows = new String[numRows];
        String res="";

        if(s.length()<numRows) {
            for(int i=0;i<s.length();i++) {
                rows[i] = s.charAt(i)+"";
            }
        }
        else {
            for(int i=0;i<numRows;i++) {
                rows[i] = s.charAt(i)+"";
            }
        }


        for(int i = numRows; i < s.length(); i++) {
            if(pos==0) {
                rows[pos] = rows[pos] + s.charAt(i);
                counter=1;
                pos+=counter;
            }
            else if(pos==numRows-1) {
                rows[pos] = rows[pos] + s.charAt(i);
                counter=-1;
                pos+=counter;
            }
            else {
                rows[pos] = rows[pos] + s.charAt(i);
                pos+=counter;
            }
        }
        if(s.length()<numRows) {
            for(int i=0;i<s.length();i++) {
                res += rows[i];
            }
        }
        else {
            for(String str: rows) {
                res += str;
            }
        }

        return res;
    }
}
