package org.main.other;

import java.util.HashSet;

public class FindTheDifference {
    public static void main(String[] args) {
       String s = "abcd";
       String t = "abcde";
       findTheDifference(s,t);
                   }
    public static char findTheDifference(String s, String t) {

        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (char c : t.toCharArray()) {
            if (!set.contains(c)) {
                return c;
            } else {
                set.remove(c);
            }
        }
        return  ' ';
    }
}
