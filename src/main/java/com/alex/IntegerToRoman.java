package com.alex;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder romanNum =  new StringBuilder();

        romanNum.append("M".repeat(num / 1000));

        num = num%1000;

        if(num/100==9) {
            romanNum.append("CM");
        } else if(num/100==4) {
            romanNum.append("CD");
        } else {
             if(num/500==1) {
                 romanNum.append("D");
                 num-=500;
             }
             romanNum.append("C".repeat(num/100));
        }
        num=num%100;

        if(num/10==9) {
            romanNum.append("XC");
        } else if(num/10==4) {
            romanNum.append("XL");
        } else {
            if(num/50==1) {
                romanNum.append("L");
                num-=50;
            }
            romanNum.append("X".repeat(num/10));
        }
        num=num%10;

        if(num==9) {
            romanNum.append("IX");
        } else if(num==4) {
            romanNum.append("IV");
        } else {
            if(num>=5) {
                romanNum.append("V");
                num-=5;
            }
            romanNum.append("I".repeat(num));
        }

        return romanNum.toString();
    }
}
