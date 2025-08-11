package org.main.stringQue;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "ab";
        String t = "a";

        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

//        HashMap<Character, Integer> charCountMap = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
//        }
//
//        for (char c : t.toCharArray())
//        {
//            if (!charCountMap.containsKey(c) || charCountMap.get(c)==0)
//            {
//                return false;
//            }
//
//            charCountMap.put(c,charCountMap.get(c)-1);
//        }
//        return true;


        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        for (int i = 0; i < charArrayS.length; i++) {

            if(charArrayS[i]!=charArrayT[i])
            {
                return false;
            }
        }
        return true;
    }


}

