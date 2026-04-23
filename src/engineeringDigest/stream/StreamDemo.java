package engineeringDigest.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    //Feature introduced in java 8
    //process collection of data in a functional & declarative manner.
    //Simplify data processing
    //Embrace functional Programming
    //Improve Readability & maintainability
    //Enable easy parallelism

    //What is stream?
    // a sequence of elements supporting functional & declarative programming

    //How to use Stream?
    // Source, Intermediate operation & terminal operation
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,5,4,6);
        //Traditional way of counting no of even number in the number list
        int count=0;
        for(int i: number){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("No of even number in the list :" + count);  //3

        //Stream
        System.out.print("No of even number in the list with the help of Stream :");
        System.out.println(number.stream().filter( x -> x %2 == 0).count());

        //Creating streams

        // 1. From Collection
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream(); //-->list is now converted into stream.

        // 2. from arrays
        String[]  array= {"a","bb","ccc"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. using Stream.of() form direct values
        Stream<String> stream2 = Stream.of("aa","bb","cc");

        // 4. infinity Stream   //Infinity Stream of 1 will be created and upto limit 50
        Stream<Integer> generate = Stream.generate(() -> 1).limit(10);
        generate.forEach(System.out::println);
         List<Integer> infinityList =Stream.iterate(1, x -> x + 5).limit(15).toList();
        System.out.println(infinityList);
    }
}
