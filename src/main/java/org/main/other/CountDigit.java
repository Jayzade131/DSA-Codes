package org.main.other;

public class CountDigit {

    public static void main(String[] args) {
        int n = 345;
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n) {
        int count = 0;
        if (n==0)
        {
            return 1;
        }
        while (n > 0) {
            n = n / 10;
            count++;

        }
        return count;
    }


}
