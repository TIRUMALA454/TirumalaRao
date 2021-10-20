package pack1;
import java.util.Scanner;
public class UsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a number");
		int i=sc.nextInt();
		if(i%7==0)
		{
			System.out.println("the given number is divisible by seven");
		}
		else
		{
			System.out.println("the given is not divisible by seven");
		}
		
	

	}

}
