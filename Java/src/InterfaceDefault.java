
public class InterfaceDefault implements Interface1,Interface2 {

	public static void main(String[] args) {
		Interface1 int1 = new InterfaceDefault();
		int1.log("Hello");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void log(String str) {
		System.out.println(" My class logging ...."+str);
	}

}
