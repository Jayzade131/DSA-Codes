package org.main.stringQue;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String lastWord = s1[s1.length - 1];


        return lastWord.length();
    }
}
