import java.util.Arrays;
import java.util.List;

public class DemoMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Tom","Alex","Dany");
        names.forEach(s -> System.out.println("s = " + s));
        names.forEach(System.out::println); // Method reference
    }
    
}
