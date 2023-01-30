
@FunctionalInterface
interface Demo{
	void abc();
	static void show() {
		System.out.println("In static show");
	}
	
}
public class InterfaceStaticDemo {
	public static void main(String[] args) {
		Demo.show();
	
	}

}
