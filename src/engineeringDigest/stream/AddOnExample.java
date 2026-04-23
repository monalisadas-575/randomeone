package engineeringDigest.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AddOnExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> stream = names.stream()
                .filter(name -> {
                        System.out.println("Filtering :"+name);
                                return name.length() > 3 ;
                } );
        System.out.println("before terminal operation");
        List<String> res = stream.toList();
        System.out.println("After terminal operation : "+res);
    }
}
