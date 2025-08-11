package org.main.stringQue;

import java.util.Arrays;

public class ReverseVowelsString {

    public static void main(String[] args) {

        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (end > start) {

            if (!isVowels(charArray[start]))
            {
                start++;
                continue;
            }
            if (!isVowels(charArray[end]))
            {
                end--;
                continue;
            }

            char temp = charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;

            start++;
            end--;

        }
        return new String(charArray);
    }

    public static boolean isVowels(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;

    }
}
