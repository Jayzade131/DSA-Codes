package org.main.other;

public class RomanToInt {

    public static void main(String[] args) {
       String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        int sum =0;
        int prev=0;

        for (int i = s.length()-1; i >=0 ; i--) {
            int cur=getNumv(s.charAt(i));

            if (cur<prev)
            {
                sum-=cur;
            }
            else{
                sum+=cur;
            }
            prev=cur;

        }
        return sum;


    }

    private static int getNumv(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };

    }
}
