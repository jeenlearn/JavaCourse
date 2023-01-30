
public class ExceptionDemo {

	public static void main(String[] args)
	{
		int i,j;
		i=8;
		j=9;
		try 
		{
			int k =i/j;
			if(k==0)
				throw new OwnException("Problem");
			System.out.println(k);
		}
		catch(OwnException e)
		{
			System.out.println("Inside catch");
			System.out.println("Errroooooooooooooooor "+e);
		}
	}
}
