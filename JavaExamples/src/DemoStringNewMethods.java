public class DemoStringNewMethods {
    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" JEENA ".strip());
        System.out.println(" JEENA ".stripLeading());
        System.out.println(" JEENA ".stripTrailing());

        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
        System.out.println((String) "UNHAPPY".transform(s -> s.substring(2)));
        System.out.println("My name is %s and I have %d kids".formatted("Jeena",2));

    }
}
