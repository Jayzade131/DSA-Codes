package org.main.stringQue;

public class MergeAlternately {

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));

    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
       int wl1 = word1.length();
       int wl2 = word2.length();
        int max = Math.max(wl1, wl2);
        int min = Math.min(wl1,wl2);
        if (wl2>wl1) {
            for (int i = 0; i < wl2; i++) {
                if (i < wl1) {
                    sb.append(word1.charAt(i));
                }
                sb.append(word2.charAt(i));

            }
        }else{
            for (int i = 0; i < wl1; i++) {
                sb.append(word1.charAt(i));
                if (i < wl2) {
                    sb.append(word2.charAt(i));
                }


            }
        }
        return sb.toString();
    }

}
