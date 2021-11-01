package lab1;
import java.util.*;

public class SumOfCubes {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int s=0,d,copy=num;
		while(num>0) {
		d=num%10;
		s+=d*d*d;
		num/=10;
		}
		System.out.println("The sum of the cubes of the digits of "+copy+" is "+s);
		}

		}


