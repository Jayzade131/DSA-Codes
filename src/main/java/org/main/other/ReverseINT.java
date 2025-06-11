package org.main.other;

public class ReverseINT {
    public static void main(String[] args) {

        int number=123;
        int reverse = reverse(number);
        System.out.println(reverse);

    }

    public static int reverse(int x) {

        int rev=0;
        while (x!=0)
        {

           int rem= x % 10;
           rev=rev*10+rem;

           x=x/10;
        }
        return rev;

    }
}
