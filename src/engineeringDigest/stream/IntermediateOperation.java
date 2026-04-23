package engineeringDigest.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {

        //Intermediate Operation convert Stream into another stream
        //They don't execute until terminal operation is invoked.
        // 1. Filter
        List<String> list = Arrays.asList("Ankit", "shrishant", "Anupama", "harihar","Ankit");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        //no filtering till this point till termination operation
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        // 2. Map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        System.out.println( list.stream().map(String::toUpperCase).toList());
        // 3. Sort
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b) -> a.length()-b.length());
        // 4. distinct
        System.out.println(list.stream()
                .filter(x -> x.startsWith("A"))
                .distinct().count());   //distinct deletes the duplicate count.
        // 5. limit
        List<Integer> list1 = Stream.iterate( 1, x -> x+1).limit(50).toList();
        System.out.println(list1);

        // 6. skip
        List<Integer> list2 = Stream.iterate( 1,x -> x+1).skip(10).limit(50).toList();
        System.out.println(list2);

        // 7. peek
        //performs  an action on each element as it is consumed
        Stream.iterate(1,x -> x + 1).limit(100).peek(System.out::println).count();

        // 8. flatMap
        //Handle stream of collection, list and array where each element is itself collection.
        //flattened nested structure ( e.g., list within lists) so that they can be processed as single sequence of elements
        //Transform & flatten elements at the same time
        List<List<String>> listOfLists = Arrays.asList(
                    Arrays.asList("apple", "banana"),
                    Arrays.asList("orange", "kiwi"),
                    Arrays.asList("pear","grape")
        );
        System.out.println(listOfLists.get(0).get(0));   //--apple
        System.out.println(listOfLists.stream().flatMap( x -> x.stream()).map(String::toUpperCase).toList());
        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java streams are powerful",
                "flatMap is ueful"
        );
        System.out.println(sentences.stream()
                .flatMap(sentence ->Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList());



    }
}
