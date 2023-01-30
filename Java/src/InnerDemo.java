/*Inner Class --
 * Member class
 * Static class  
 * Anonymous class

 */
class Outer
{
	int a;
	public void show()
	{
		
	}
	static class Inner //Outer$Inner.class
	{
		public void display() 
		{
			System.out.println("In display");
		}
	}
	}
public class InnerDemo {

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		//Outer.Inner obj2 = obj.new Inner();  member inner class
		Outer.Inner obj2 = new Outer.Inner();  //static  inner class
		obj2.display();

	}

}
