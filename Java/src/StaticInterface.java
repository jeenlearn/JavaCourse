
public interface StaticInterface {
	
	default void print(String str) {
		if(!isNull(str))
			System.out.println("Data is printed  :"+str);
	}
	static boolean isNull(String str) {
		System.out.println("Interface null check");
		return str== null?true:"".equals(str)?true:false;
	}

}
