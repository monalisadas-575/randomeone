package engineeringDigest;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // 1. Collectors is a utility class.
        //It provides set of methods to create  common collectors.
        List<String> names = Arrays.asList("Alice", "Bob","Charlie");
        List<String> res = names.stream()
                .filter(name  ->name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3,4 ,4 ,5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);


        // 3.Collecting to specific collection
        ArrayDeque<String> collect = names.stream()
                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // 4.Joining String
        //Concatenate string element to a single stream
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(concatenatedNames);

        // 5. Summarizing Data
        //Generates statistical summary (count, sum, min, average, max )
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics collect1 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("count :"+collect1.getCount());
        System.out.println("sum :"+collect1.getSum());
        System.out.println("min :"+collect1.getMin());
        System.out.println("average :"+collect1.getAverage());
        System.out.println("max :"+collect1.getAverage());

        // 6. Calculating Average
        Double collect2 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(collect2);

        //7. Counting elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println(count);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java","stream","collection");
        System.out.println( words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
         TreeMap<Integer,Long> treeMap =words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9.Partitioning elements
        //Partition elements into two group (true & false) based on prediction
        System.out.println(words.stream().collect(Collectors.partitioningBy( x-> x.length() > 5)));

        // 10. Mapping & Collecting
        //Applies mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping( x-> x.toUpperCase(), Collectors.toList())));




    }
}
