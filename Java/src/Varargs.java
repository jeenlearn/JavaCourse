
class Calc{
	public int add(int...n) {
		int sum=0;
		for(int k:n) {
			sum=sum+k;
		}
		return sum;
	}
}
public class Varargs {

	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(4,2,6,10,1,1,1,2,2,3));
		
	}

}
