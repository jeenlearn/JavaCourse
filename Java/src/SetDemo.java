import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<>();
		values.add(67);
		values.add(45);
		values.add(88);
		values.add(190);
		for(int i:values)
		{
			System.out.println(i);
		}
	}
	
}
