package com.alex;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i<words.length-1; i++) {
            boolean next = false;

            char[] word1 = words[i].toCharArray();
            char[] word2 = words[i+1].toCharArray();

            for(int j = 0; j<Math.min(word2.length, word1.length); j++) {
                if(word1[j]!=word2[j]) {
                    if(order.indexOf(word1[j])>order.indexOf(word2[j])) {
                        return false;
                    }
                    else {
                        next = true;
                        break;
                    }
                }
            }
            if(next) {
                next = false;
                continue;
            }

            if(word1.length>word2.length)
                return false;
        }
        return true;
    }
}
