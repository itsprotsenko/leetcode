package com.alex;

import java.util.*;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
//        Attempt 1
//        --------------------------------------------

//        int j = 0, i = 0;

//        while(i < s.length() && j < p.length()) {
//            if(p.charAt(i) == '.') {}
//            else if(p.charAt(i) == '*') {
//                if(p.charAt(i-1) == '.') return true;
//                boolean loop = true;
//                while(loop && j < p.length()) {
//                    if(s.charAt(j) == p.charAt(i-1)) j++;
//                    else loop = false;
//                }
//            } else if(s.charAt(i) != p.charAt(j)) return false;
//            j++;
//            i++;
//        }
//        if(j<s.length() || i<p.length()) return false;
//
//        return true;

//        Attempt 2
//        --------------------------------------------

//        int i = s.length()-1, j = p.length()-1;
//
//        while(j>0 && i>=0 && p.charAt(1) != '*') {
//            if(p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)) {
//                i--;
//                j--;
//                s=s.substring(1);
//                p=p.substring(1);
//            } else {
//                return false;
//            }
//        }
//
//        while(j >= 0) {
//            if(p.charAt(j) == '*') {
//                if(i<0) {
//                    i++;
//                    j--;
//                }
//                else if(p.charAt(j-1)=='.') {
//                    j--;
//                    i=0;
//                } else {
//                    j--;
//                    while(i>=0 && s.charAt(i) == p.charAt(j)) i--;
//                    i++;
//                }
//            }
//            else if(p.charAt(j) != '.') {
////                if(i<0) return false;
//                try {
//                    if(p.charAt(j) != s.charAt(i)) return false;
//                } catch(Exception e) {
//                    return false;
//                }
//
//            }
//            i--;
//            j--;
//        }
//
//        return i < 0 && i == j;

//        Attempt 3
//        --------------------------------------------

//        boolean any = false;
//        boolean match = false;
//        List<Character> chars = new ArrayList<>();
//        int start = 0, curr = 0;
//
//        while(true) {
//            if(s.isEmpty()) {
//                return p.indexOf('*')!=-1 && p.length()%2==0 && p.split("\\*").length == p.length()/2;
//            }
//            if(p.isEmpty()) return false;
//            if(p.charAt(p.length()-1) == '*') break;
//            if(p.charAt(p.length()-1)=='.' || s.charAt(s.length()-1) == p.charAt(p.length()-1)) {
//                s = s.substring(0, s.length()-1);
//                p = p.substring(0, p.length()-1);
//                if(p.isEmpty() && s.isEmpty()) return true;
//            }
//            else return false;
//        }
//
//        for (int i = 0; i < p.length(); i++) {
//            if((s.isEmpty() && p.indexOf('*')==-1) || p.isEmpty()) return false;
//            if(i != p.length()-1 && p.charAt(i+1) == '*') {
//                if(p.charAt(i) == '.') {
//                    any=true;
//                } else {
//                    chars.add(p.charAt(i));
//                }
//                i++;
//            } else if(p.charAt(i) == '.') {
//                if(s.isEmpty()) return false;
//                s = s.substring(1);
//                p = p.substring(i+1);
//                i=-1;
//            }
//            else {
//                while(curr < s.length()) {
//                    if(s.charAt(curr) == p.charAt(i)) {
//                        if(any || start==curr) {
//                            curr++;
//                            start=curr;
//                            any=false;
//                            chars.clear();
//                            match=true;
//                            break;
//                        } else {
//                            for(char c: s.substring(start, curr).toCharArray()) {
//                                if(!chars.contains(c)) {
//                                    return false;
//                                }
//                            }
//                            chars.clear();
//                            curr++;
//                            start=curr;
//                            match=true;
//                            break;
//                        }
//                    }
//                    curr++;
//                }
//                if(!match) return false;
//                match=false;
//            }
//        }
//
//        if(!(s.length()==curr || any)) {
//            for(char c: s.substring(start).toCharArray()) {
//                if(chars.contains(c)) {
//                    while(chars.get(0)!=c) chars.remove(0);
//                }
//                else return false;
//            }
//        }
//        return true;
        return false;
    }
}
