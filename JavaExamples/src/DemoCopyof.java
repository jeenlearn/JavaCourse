import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoCopyof {
    public static void main(String[] args) {
        List<String> names =  new ArrayList<String>();
        names.add("John");
        names.add("Jerry");
        names.add("Jude");
        List<String> copyofNames = List.copyOf(names);
        doNotChangeNames(copyofNames);  // cannot add to immutable collection.
        System.out.println(names);
    }

    private static void doNotChangeNames(List<String> names) {
        names.add("Should not add");
    }
}
