package org.main.binarySearch;

import java.util.Scanner;

public class binary10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String str = String.valueOf(n);
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '0' && str.charAt(i + 1) == '0') {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
