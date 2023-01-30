import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList();
		values.add(119);
		values.add(464);
		values.add(163);
		values.add(355);
//		Comparator<Integer> c = new Comparator<Integer>()
//		{
//			public int compare(Integer i,Integer j)
//			{
//				return i%10>j%10?1:-1;
//			}
//		};
	//	Comparator<Integer> c =(i,j)->i%10>j%10?1:-1;
			
		
		Collections.sort(values,(i,j)->i%10>j%10?1:-1);
		
		for(Integer i : values)
			System.out.println(i);
		
	}

}
