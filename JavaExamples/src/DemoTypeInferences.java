import java.util.List;

public class DemoTypeInferences {
    public static void main(String[] args) {
        List<String> names1 = List.of("Drake","Holly");
        List<String> names2 = List.of("Tom","Jerry");
        var names = List.of(names1,names2); // final var is also possible
        names.stream().forEach(System.out::println);

        for(var name:names1) // var can be used in for loop
            System.out.println(name);
    }
}
