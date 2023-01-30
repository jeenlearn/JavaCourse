package Java8features;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		for (int i =0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		for(int i: values) {
			System.out.println(i);
		}
		System.out.println("For Each");
		values.forEach(i -> System.out.println(i));
		

	}

}
