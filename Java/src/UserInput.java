import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//BufferedReader
//Scanner
public class UserInput {

	public static void main(String[] args) throws Exception {
		//BufferedReader br =null;
		int n=0;
		System.out.println("Enter a number:");
//		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
//			
//			n= Integer.parseInt(br.readLine());
//		}
//		catch(Exception e){
//			System.out.println( "Exception : "+e);
//		}
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		System.out.println(n);
//		finally {
//			br.close();
//		}
		System.out.println("Number entered is :"+n);
	}

}
