package Lab1;

import java.util.Scanner;

public class CalculateSum {
	public static int calculateSum(int n) {
		int i,s=0,k=1;
		for(i=1;i<=n;k++) {
		if(k%3==0 || k%5==0) {
		s+=k;
		i++;
		}
		}
		return s;
		}

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		System.out.println(calculateSum(n));

		}

		

}
