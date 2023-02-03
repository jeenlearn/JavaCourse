import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static boolean isEven(Integer number){
        return number%2==0;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,5,4,14,12,9,6,10,11);
       // Predicate<Integer> evenNumberPredicate = number -> number%2==0;
       // numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
        //numbers.stream().filter(Predicate.not(DemoPredicate::isEven)).forEach(System.out::println);
       // numbers.stream().filter(n -> n%2==0).sorted().map(n ->n*2).forEach(System.out::println);
        int result = numbers.stream().filter(n -> n%2==0).map(n ->n*2).reduce(0,(c,e)->c+e);
        System.out.println(result);

    }
}
