package pack1;
import java.util.Scanner;

public class palindrome {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a sevens number"); 
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),
			e=sc.nextInt(),f=sc.nextInt(),g=sc.nextInt();
		
		if(a<b&&a<c&&a<d&&a<e&&a<f&&a<g)
		{
			System.out.println(a+"is smallest");	
		}
		else if(b<c&&b<d&&b<e&&b<f&&b<g)
		{
			System.out.println(b+"is smallest");
		}
		else if(c<d&&c<e&&c<f&&c<g)
		{
			System.out.println(c+"is smallest");	
		}
		else if(d<e&&d<f&&d<g)
		{
			
			System.out.println(d+"is smallest");	
		}
		else if(e<f&&e<g)
		{
			System.out.println(e+"is smallest");	
		}
		else if(f<g)
		{
			System.out.println(f+"is smallest");	
		}
		else
		{
			System.out.println(g+"is smallest");	
		}
		}
}