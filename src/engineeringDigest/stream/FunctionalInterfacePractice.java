package engineeringDigest.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {


        //Predicate---->Boolean valued function( We can store function in variable)

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(6));
        Predicate<String> isWordStartingWithA = x->x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and=isWordEndingWithT.and(isWordStartingWithA);
        System.out.println(and.test("Ankit"));
        System.out.println(isWordStartingWithA.test("knkit"));  //false

        //Function--->we can do the work
        Function<Integer, Integer>  doubleIt = x -> 2 * x;
        Function<Integer,Integer>  tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(3)); //x=6,x=6*3 ( ans-18)
        System.out.println(tripleIt.andThen(doubleIt).apply(4));  //x=12,x=12*2 (ans=24)  same
        System.out.println(doubleIt.compose(tripleIt).apply(4));  //x=12,x=12*2 (ans=24)  same

        Function<Integer, Integer> identity=Function.identity();
        System.out.println(identity.apply(6));  //it will print the same value as given

        //Consumer --> It don't return
        Consumer<Integer> toBePrinted= x -> System.out.println(x);
        toBePrinted.accept(500);
        List<Integer> list= Arrays.asList(1,2,3,5);
        Consumer<List<Integer>> consumerList = x ->{
            for( int i: x){
                System.out.println(i);
            }
        };
        consumerList.accept(list);

        //Supplier--->It only return don't take.
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        //Combined Example of Consumer,Supplier,Function, Predicate
        Predicate<Integer> predicate = x -> x % 2 ==0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())) {
            consumer.accept((function.apply(supplier.get())));   //10000
        };

        //BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y) %2 ==0;
        System.out.println(isSumEven.test(5, 5));
        BiConsumer<Integer,String> biConsumer= (x, y) ->{
            System.out.println(x);
            System.out.println("I am hero");
        };
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x+y).length();
        System.out.println( biFunction.apply("ab","Mona"));

        //Unary-->When both given( 1) & return type is same.
        //Binary--> when 2 both given 7 return type is same
        UnaryOperator<Integer> unary= x -> 2 * x;
        BinaryOperator<Integer> binary= (x, y) ->( x + y );
        System.out.println(" Application of Unary Operator :" + unary.apply(5));
        System.out.println("Application if Binary Operator :" + binary.apply(5,6));

        //Method reference-->Use method without invoking & in place of Lambda expression
        List<String> students = Arrays.asList("Ram" , "Shyam" , "ghnaShyam");
        students.forEach( x -> System.out.println(x));
        students.forEach(System.out::println); //method reference

        //Constructor Reference
        List<String> names = Arrays.asList("A", "B", "C");
        //names.stream().map(x -> new mobilePhone()).collect(Collectors.toList());
        List<MobilePhone> listOfMobile= names.stream().map(MobilePhone::new).collect(Collectors.toList());
        List<String> names1=List.of("A", "B", "C");
    }
}


class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
