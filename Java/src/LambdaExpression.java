
public class LambdaExpression {

	public static void main(String[] args) {
		Printable printLambda = () -> System.out.println("Meow");
		
		printThing(printLambda);
	}	
		static void printThing(Printable thing) {
			thing.print();
		}

	

}
