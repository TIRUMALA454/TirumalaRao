package lab1;
import java.util.Scanner;

public class FibonacciSequence {
	public static int nthValue(int n) {
		int f=1, s= 1,t=f+s;
		if(n<=2)
		return 1;
		for(int i=3;i<=n;i++) {
		t=f+s;
		f=s;
		s=t;
		}
		return t;
		}
		public static int rec(int n) {
		if(n<=2)
		return 1;
		return rec(n-1)+rec(n-2);
		}

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		/*for(int i=1;i<=n;i++) {
		System.out.print(rec(i)+" ");
		}*/

		System.out.println("nth value of Fibonacci sequence is "+rec(n));

		}

		}


