
public interface Interface2 {
	void method2();
	default void log(String str) {
		System.out.println("Interface 2 log method ...."+str);
	}

}