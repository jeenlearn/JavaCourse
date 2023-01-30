
class Emp{
	int eid;
	int salary;
	static String ceo;
	
	static {
		ceo="Larry";
	}
	public void show(){
		System.out.println(eid + ":"+salary+":"+ceo);
	}
}
public class ObjectDemo {
	static int i=10;
	public static void main(String[] args) {
		System.out.println(i);
		Emp emp1 = new Emp();
		emp1.eid=1;
		emp1.salary=1000;
		//Emp.ceo ="ABC";
		
		Emp emp2 = new Emp();
		emp2.eid=2;
		emp2.salary=2000;
		 
		
		emp1.show();
		emp2.show();
		
		

	}

}
