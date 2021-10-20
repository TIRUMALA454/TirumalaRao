package pack1;
import java.util.Scanner;
public class User {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a number");
		int a=sc.nextInt();
		System.out.println("eneter a number");
		int b=sc.nextInt();
       add(a,b);
     
     System.out.println(sub(a,b));
     System.out.println(mul(a,b));
     System.out.println(per(a,b));
     
	}
		public static void add(int a,int b)
		{
			int c =a+b;
			 System.out.println(c);
		}
		public static int sub(int a,int b)
		{
			int c =a-b;
			return c;
		}
		public static int mul(int a,int b)
		{
			int c =a*b;
			return c;
		}
		public static int per(int a,int b)
		{
			int c =a%b;
			return c;
		}
		
		
		}


