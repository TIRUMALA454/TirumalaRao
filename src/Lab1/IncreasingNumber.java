package lab1;

import java.util.Scanner;

public class IncreasingNumber {
	public static boolean checkNum(int num) {
		int l=num%10;
		num/=10;
		while(num>0) {
		if(l<num%10)
		return false;
		l=num%10;
		num/=10;
		}
		return true;
		}

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(checkNum(n));

		}

		}


