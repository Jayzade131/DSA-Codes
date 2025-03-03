package org.main.stringQue;

public class ValidPalindrome2 {

    public static void main(String[] args) {
        String s = "cbbcc";
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
        boolean first= false;
        boolean status = false;
        while (start <= end) {

            char a = s.charAt(start);
            char b = s.charAt(end);
            if (a == b) {
                start++;
                end--;
            }
            else {
                return checkAfterDeletionOneElement(s, start+1, end) || checkAfterDeletionOneElement(s, start, end-1);
            }

        }
        return true;
    }

  private static boolean checkAfterDeletionOneElement(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return false;
    }
}
