package engineeringDigest.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1 ,2 ,3 ,4 ,5);
        // 1. Collect
        System.out.println(list.stream().skip(2).collect(Collectors.toList()));
        list.stream().skip(3).toList();

        // 2. forEach
       // list.stream().forEach( x-> System.out.println(x));

        // 3. Reduce
        //todo reduce() combines stream elements into one result,
        // and without an initial value it returns Optional because stream may be empty.
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        System.out.println(optionalInteger.get());

        // 4. count
        // 5. anyMatch, allMatch, noneMatch
        boolean match1 = list.stream().anyMatch(x -> x % 2 == 0);
        boolean match2 = list.stream().allMatch(x -> x > 0);
        boolean match3 = list.stream().noneMatch( x -> x<2);
        System.out.println(match3);

        // 6. findFirst,findAny
        System.out.println(list.stream().skip(1).findFirst().get());
        System.out.println(list.stream().findAny().get());

        //7. to Array()
        Object[] array = Stream.of(1,2,3).toArray();

        // 8. min, max
        System.out.println(" max : " +Stream.of(2,44,69).max(Comparator.naturalOrder()));

        //Example
        List<String> names =Arrays.asList("Alice","Bob","jackson","Peter");
        Stream<String> stream = names.stream();

        //Stream can't be reused after terminal operation has been called.
        stream.forEach(System.out::println);
       // List<String> list1 = stream.map(String::toUpperCase).toList(); //exception

        // 9. forEachOrdered
        List<Integer> number0 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("using forEach with parallel stream: ");
        number0.parallelStream().forEach(System.out::println);
        System.out.println("using forEachOrdered with parallel stream");
        number0.parallelStream().forEachOrdered(System.out::println);

    }
}

