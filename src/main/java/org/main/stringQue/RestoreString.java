package org.main.stringQue;

import java.util.Arrays;

public class RestoreString {

    public static void main(String[] args) {
       String s = "codeleet";
       int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] c= s.toCharArray();
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]]=c[i];
        }
        return String.valueOf(ans);
    }
}
