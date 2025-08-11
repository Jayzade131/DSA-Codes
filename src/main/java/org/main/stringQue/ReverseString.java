package org.main.stringQue;

public class ReverseString {

    public static void main(String[] args) {
       char[] s = {'H','a','n','n','a','h'};
       reverseString(s);
    }

    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;

        while (end>start)
        {
           char temp = s[start];
           s[start]=s[end];
           s[end]=temp;

           start++;
           end--;

        }
    }
}
