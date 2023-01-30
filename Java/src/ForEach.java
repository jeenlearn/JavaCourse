import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Victor","Alex","Ben","Larry");
		//names.forEach(System.out::println);
		
		Consumer<String> makeUpperCase = new Consumer<String>() {
				@Override
				public void accept(String t) {
					System.out.println(t.toUpperCase());
				}
		};
		
		names.forEach(makeUpperCase);
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("A","Victor");
		map.put("B","Alex");
		map.put("C","Ben");
		map.put("D","Larry");
		map.forEach((k,v) -> 
			System.out.println("Key =" +k+" , Value = "+ v));
		
		BiConsumer<String,Integer> action = (a,b)->
		{
			System.out.println(" Key is :" +a);
			System.out.println(" Value is : " +b);
		};
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		map1.put("D", 4);
		map1.forEach(action);
		
		List<String> gameList = new ArrayList<String>();
		gameList.add("Cricket");
		gameList.add("Football");
		gameList.add("chess");
		gameList.add("hockey");
		gameList.add("badminton");
		gameList.forEach(games -> System.out.println(games));
		System.out.println("Ordered Stream");
		gameList.stream().forEachOrdered(games -> System.out.println(games));
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
	     
		Consumer<Integer> action1 = System.out::println;
		numberList.stream().filter(n -> n%2 == 0).forEach(action1);
		
		numberList.stream().filter(n -> n%2 ==0).forEachOrdered(action1);
	}

}

