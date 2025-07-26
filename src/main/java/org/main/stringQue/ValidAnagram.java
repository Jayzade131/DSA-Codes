package org.main.stringQue;

import java.util.HashSet;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "ab";
        String t = "a";

        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {

        HashSet<Character> set = new HashSet<>();


        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (char c : t.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }

        return true;


    }
}

