package engineeringDigest.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {


        //A type of stream that enable parallel processing of elements.
        //Allowing multiple threads to process parts of stream simultaneously.
        //This can significantly improve performance for large set of data.
        //workload is distributed across multiple threads.
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream: "+(endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        factorialList = list.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream: "+(endTime - startTime) + "ms");

        //Parallel streams are most effective for CPU-intensive or large dataset where task are independent.
        //They may overhead for simple tasks and small dataset.

        //cumulative sum
        //[1, 2, 3, 4,5] --> [1 ,3 ,6 ,10 ,15
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        AtomicInteger sum2 = new AtomicInteger(0);
        List<Integer> cumulativeSumUsingSequentialStream = //sequential uses single thread. to get value order-dependent we use this
                numbers.stream().sequential().map(sum2::addAndGet).toList();
        System.out.println("expected cumulative sum : [ 1, 3, 6 ,10 ,15 ]");
        System.out.println("actual result cumulative sum with parallelstream : "+cumulativeSum);
        System.out.println("correct result using sequential stream : "+cumulativeSumUsingSequentialStream);
    }
    private static long factorial(int n){
        long result = 1;
        for(int i = 2 ; i<=n ;i++){
            result *= i;
        }
        return result;
    }

}
