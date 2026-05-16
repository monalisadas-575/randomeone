package engineeringDigest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamPractice {
    public static void main(String[] args) {

        //Example-1 =show all the string with length lessthan 3
        List<String>  stringList= Arrays.asList("Mona","Monalisa","ma","mo","moana");
        System.out.println(stringList.stream().filter(x -> x.length() < 3).toList());
        //Array.toString is used becoz while converting to Array it will print the hashcode so we are printing the toString value
        System.out.println(Arrays.toString(stringList.stream().filter(x -> x.length() < 3).toArray()));

        //Ex- 2= square and sort the numbers in the list
        List<Integer> integerList= Arrays.asList(5,8,2,3,9);
        System.out.println(integerList.stream().map(x -> x * x).sorted(Comparator.naturalOrder()).toList());
        System.out.println(integerList.stream().map(x -> x * x).sorted((x,y) -> y-x).toList());

        //Ex - 3 =summing values
        List<Integer> integers = Arrays.asList( 2,4,5,10);
        System.out.println(integers.stream().reduce((x,y) -> x+y).get());

        //ex - 4 = counting occurrence of character
        String sentence = "hello world";
        System.out.println(sentence.chars().filter( x-> x== 'l').count());


        //exa-1: Collecting names by length
        List<String> l1 = Arrays.asList("Anna", "Bob", "alexander"," Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        //Exa-2: Counting word occurrence
        String sentences = "hello world hello world java";
        System.out.println(Arrays.stream(sentences.split(" ")).collect(Collectors.groupingBy(x -> x,Collectors.counting())));
        //exa- 3: Partitioning by even & odd number
        List<Integer> l2 = Arrays.asList(1,2,3,4,5);
        System.out.println(l2.stream().collect(Collectors.groupingBy(x ->x % 2 == 0)));

        //exa -4: Summing values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));  //alternative
        System.out.println(items.values().stream().collect(Collectors.summingInt( x -> x)));

        //exa- 5: Creating map from Stream elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap( x->x.toUpperCase(),x->x.length())));

    }
}
