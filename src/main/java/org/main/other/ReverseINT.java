package org.main.other;

public class ReverseINT {
    public static void main(String[] args) {

        int number=-123;
        int reverse = reverse(number);
        System.out.println(reverse);

    }

    public static int reverse(int x) {
        boolean neg = x < 0;
       x= Math.abs(x);

        int rev=0;
        while (x!=0)
        {

           int rem= x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && x > 7)) {
                return 0; // overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < -8)) {
                return 0; // underflow
            }
           rev=rev*10+rem;

           x=x/10;
        }
        return neg ?-rev:rev;

    }
}
