package org.main.stringQue;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "a";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {


        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        boolean status = false;
        while (start <= end) {

            char a = s.charAt(start);
            char b = s.charAt(end);
            if (a == b) {
                start++;
                end--;
                status = true;
            } else {
                status = false;
                return false;
            }

        }
        return status;
    }
}
