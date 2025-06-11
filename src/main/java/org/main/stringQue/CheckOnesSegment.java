package org.main.stringQue;

public class CheckOnesSegment {
    public static void main(String[] args) {
        String s = "1100";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        int count = 0;
        boolean segment = false;
        for (char c : s.toCharArray())
        {
            if (c == '1')
            {
                if (!segment)
                {
                    count++;
                    segment =true;
                }
            }
            else {
                segment = false;
            }
        }

        return count <=1;
    }

}
