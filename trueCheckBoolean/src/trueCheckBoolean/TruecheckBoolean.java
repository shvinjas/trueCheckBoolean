
package trueCheck;
import java.util.Scanner;
public class TrueCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		Boolean name = sc.hasNextInt();
		//System.out.println(sc.hasNextInt());
		if(name==true)
{
	System.out.println("Verification success");
}
else {
	System.out.println("Verification failed");
}

	}
	}


