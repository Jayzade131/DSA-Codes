package org.main.stringQue;

public class ArrayStringsAreEqual {

    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
       String[]word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1,word1));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1= new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        String stt="HELO";
        stt.toLowerCase();
        for(String s: word1)
        {
           str1.append(s);
        }

        for(String s: word2)
        {
            str2.append(s);
        }
        if (str1.compareTo(str2) == 0)
        {
            return true;
        }

        return false;


    }
}
