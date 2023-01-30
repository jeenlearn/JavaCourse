
public class StaticInterfaceImpl implements StaticInterface {
	
//	public boolean isNull(String str) {
//		System.out.println("Impl  Null Check");
//		return str == null? true:false;
//	}

	public static void main(String[] args) {
		StaticInterfaceImpl obj = new StaticInterfaceImpl();
		obj.print("");
		obj.print("abc");

	}

}
