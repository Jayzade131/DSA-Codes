package org.main.other;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQue1 {

    public static void main(String[] args) {

        // 1.  Given a list of integers [3, 7, 2, 8, 1, 9], use the Stream API to filter numbers greater than 5 and collect them into a new list.
        List<Integer> element = List.of(3, 7, 2, 8, 1, 9);
        List<Integer> list = element.stream().filter(n -> n > 5).collect(Collectors.toList());
        System.out.println(list);

        //2.  Given a list of strings ["hello", "world", "java"], convert all strings to uppercase using the Stream API.
        List<String> element1 = List.of("hello", "world", "java");
        List<String> list1 = element1.stream().map(String::toUpperCase).toList();
        System.out.println(list1);

        //3. Count how many strings in a list ["apple", "banana", "cherry", "date"] have a length greater than 5.
        long count = Stream.of("apple", "banana", "cherry", "date").filter(s -> s.length() > 5).count();
        System.out.println(count);

        //4. Given a list of integers [1, 2, 3, 4], compute the sum of their squares (i.e., 1² + 2² + 3² + 4²) using reduce().
        Integer reduce = Stream.of(1, 2, 3, 4).map(s -> s * s).reduce(0, Integer::sum);
        System.out.println(reduce);

        //5. Given a list of strings ["dog", "cat", "bird"], sort them in alphabetical order using the Stream API.
        List<String> list2 = Stream.of("dog", "cat", "bird").sorted().toList();
        System.out.println(list2);

        //6. Given a list of integers [10, 20, 30, 40], use the Stream API to find the first element and return it as an Optional.
        Optional<Integer> first = Stream.of(10, 20, 30, 40).findFirst();
        System.out.println(first);

        //7. Given a list of strings ["apple", "apricot", "banana", "cherry"], filter strings that start with "a" and collect them into a list.
        List<String> list3 = Stream.of("apple", "apricot", "banana", "cherry").filter(s -> s.startsWith("a")).toList();
        System.out.println(list3);

        //8. Given a list of integers [1, 2, 3], use the Stream API to double each number and collect the results into a new list.
        List<Integer> list4 = Stream.of(1, 2, 3).map(a -> a * 2).toList();
        System.out.println(list4);

        //9. Given a list of integers [1, 2, 2, 3, 3, 4], remove duplicates using the Stream API and collect into a list.
        List<Integer> list5 = Stream.of(1, 2, 2, 3, 3, 4).distinct().toList();
        System.out.println(list5);

        //10. Given a list of strings ["a", "b", "c"], join them with a comma and space (", ") using Collectors.joining().
        String collect = Stream.of("a", "b", "c").collect(Collectors.joining(","));
        System.out.println(collect);

        //11. Given a list of strings ["cat", "dog", "elephant", "rat"], group the strings by their length using Collectors.groupingBy().
        Map<Integer, List<String>> collect1 = Stream.of("cat", "dog", "jayk", "jaykumar", "zade", "mahesh", "elephant", "rat").collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);

        //12.  Given a list of integers [5, 2, 9, 1, 7], find the maximum number using the Stream API.
        //Expected Output: Optional[9]
        Optional<Integer> reduce1 = Stream.of(5, 2, 9, 1, 7).max(Integer::compareTo);
        System.out.println(reduce1);

        //13. Given a list of lists [[1, 2], [3, 4, 5], [6]], flatten it into a single list using flatMap().
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6)
        );

        List<Integer> list6 = lists.stream().flatMap(List::stream).toList();
        System.out.println(list6);

        //14. Given a list of strings ["banana", "apple", "cherry", "date"], filter strings with length greater than 4, sort them, and collect into a list.
        List<String> list7 = Stream.of("banana", "apple", "cherry", "date").filter(s -> s.length() > 4).sorted().toList();
        System.out.println(list7);

        //15. Given a list of integers [10, 20, 30, 40], calculate the average using the Stream API.
        OptionalDouble average = Stream.of(10, 20, 30, 40).mapToInt(Integer::intValue).average();
        System.out.println(average);

        //16. Given a list of strings ["apple", "banana", "cherry"], check if any string starts with "b" using anyMatch().
        boolean b = Stream.of("apple", "banana", "cherry").anyMatch(s -> s.startsWith("b"));
        System.out.println(b);

        //17. Given a list of integers [1, 2, 3, 4, 5, 6, 7, 8], skip the first 2 elements and take the next 3 elements using skip() and limit().
        List<Integer> list8 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8).skip(2).limit(3).toList();
        System.out.println(list8);


    }

}
