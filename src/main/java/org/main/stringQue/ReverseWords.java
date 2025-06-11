package org.main.stringQue;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder rev= new StringBuilder();
        for (String string : str) {
            StringBuilder sb = new StringBuilder(string);
            sb.reverse();
            rev.append(sb).append(" ");

        }

       return rev.toString().trim();
    }
}
