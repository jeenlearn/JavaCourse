
public class ArrayDemo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {2,4,6,8};
		int c[]= {3,6,9,12};
		System.out.println("Enhanced for loop");
		for (int k :a) {
			System.out.println(k);
		}
		int d[][]= {
				{1,2,3,4},     //jagged array
				{2,4,6},
				{3,6,9,12,15}
		};
		System.out.println("---------------------");
		for(int i=0;i<d.length;i++) {
			for(int j=0; j<d[i].length;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int l[] :d) {
			for(int m:l) {
				System.out.print(" "+m);
			}
			System.out.println();
			
		}
	}

}
