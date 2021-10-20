package pack1;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string ");
		System.out.println();
		String s=scan.next();
		int num=s.length();
		for(int i=1;i<=num;i++) {
			System.out.print("*");
		}
		
	
	}
	
}
