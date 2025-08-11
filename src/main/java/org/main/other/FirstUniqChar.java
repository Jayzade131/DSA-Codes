package org.main.other;

public class FirstUniqChar {

    public static void main(String[] args) {
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        String s = "loveleetcode";
        int result = firstUniqChar.firstUniqChar(s);
        System.out.println("The index of the first unique character is: " + result);
        // You can test with other strings as well
    }
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

}
