class Calculator{
	
	public Calculator() {
		System.out.println("Calculator");
	}
	public int add(int i,int j) {
		return i+j;
	}
}
class AdvCalc extends Calculator{
	public AdvCalc() {
		System.out.println("AdvCal");
	}
	public int sub(int i,int j) {
		return i-j;
	}
}
class VeryAdvCal extends AdvCalc{
	public VeryAdvCal() {
		System.out.println("VeryAdvCal");
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		VeryAdvCal c = new VeryAdvCal();
		int result =c.add(1,2);
		System.out.println(result);
		int result1 =c.sub(8,2);
		System.out.println(result1);

	}

}
