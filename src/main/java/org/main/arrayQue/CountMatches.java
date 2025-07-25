package org.main.arrayQue;

import java.util.List;

public class CountMatches {

    public static void main(String[] args) {
       List<List<String>> items = List.of(
                    List.of("phone", "blue", "pixel"),
                    List.of("computer", "silver", "lenovo"),
                    List.of("phone", "gold", "iphone")
                );
                String ruleKey = "color";
                String ruleValue = "silver";
                System.out.println(countMatches(items, ruleKey, ruleValue));
    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res=0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
            {
                res++;
            } if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
            {
                res++;
            } if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
            {
                res++;
            }

        }

        return res;


    }
}
