package lab1;

import java.util.Scanner;

public class PrintPrimes {
	public static boolean isPrime(int n) {
		if(n<=1)
		return false;
		int c=0;
		for(int i=1;i<=(int)Math.sqrt(n);i++) {
		if (n%i==0)
		c++;
		}
		return c==1;
		}

		public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		if (isPrime(i))
		System.out.println(i);
		}


		}

		}



