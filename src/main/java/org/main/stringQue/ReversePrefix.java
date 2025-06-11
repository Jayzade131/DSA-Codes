package org.main.stringQue;

public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));

    }

    public static String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);

        if (end == -1) {
            return word;
        }

        char[] charArr = word.toCharArray();
        int start = 0;
        while (start <= end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }

        return new String(charArr);

    }
}
