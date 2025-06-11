package org.main.stringQue;

public class HalvesAreAlike {

    public static void main(String[] args) {
     String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
       int a= s.length()/2;
      String start= s.substring(0,a);
      String end = s.substring(a);
        int startCount=0;
        for (int i = 0; i <start.length() ; i++) {
            if (vowelsOrNot(start.charAt(i)))
            {
                startCount++;
            }
        }
        int endCount=0;
        for (int i = 0; i <end.length() ; i++) {
            if (vowelsOrNot(end.charAt(i)))
            {
                endCount++;
            }
        }

        if (startCount==endCount)
        {
            return true;
        }
        return false;


    }

    public static boolean vowelsOrNot(char c)
    {
        return switch (c) {
            case 'a' -> true;
            case 'e' -> true;
            case 'i' -> true;
            case 'o' -> true;
            case 'u' -> true;
            case 'A' -> true;
            case 'E' -> true;
            case 'I' -> true;
            case 'O' -> true;
            case 'U' -> true;
            default -> false;
        };
    }
}
