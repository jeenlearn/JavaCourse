@FunctionalInterface
interface Abc{
	void show();
	default void abc() {
		System.out.println("In abc");
	}
}

class Impl implements Abc{
	public void show() {
		System.out.println("Inside show");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
//		Abc obj = new Abc()
//				{
//					public void show() {
//						System.out.println("Inside the anonymous interface");
//					}
//				};
//		Abc obj =()-> System.out.println("Lambda expression");
//			obj.show();
		Abc obj = new Impl();
		obj.abc();
		obj.show();
			
			

	}

}
