import java.util.Arrays;
import java.util.List;

public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3,4,5,6,7,8);
        for (int i =0; i<values.size();i++){
            System.out.println("values.get(i) = " + values.get(i));
        }
        for(int i : values){
            System.out.println("i = " + i);
        }
        values.forEach(integer -> System.out.println("integer = " + integer)); //Lambda Consumer Interface
    }
}
