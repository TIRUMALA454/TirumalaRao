package lab1;

import java.util.Scanner;

public class PowerOf2 {
	public static boolean checkNum(int num) {
		return (num & num-1)==0;
		}

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(checkNum(n));
		}

		}

