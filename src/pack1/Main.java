package pack1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charactor");
		char  i=sc.next().charAt(0);
		
		switch(i) {
		case 'a':
		{
			System.out.println(1);
			
		}
		break;
		
		case 'b':
		{
			System.out.println(2);
			
			
		}
		break;
		
		case 'c':
		{
			System.out.println(3);
			
		}
		break;
		
		default:
		{
	       System.out.println("nothing");
	      
		}
		
		}
	}
}

