package lab1;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1. RED");
		System.out.println("2. YELLOW");
		System.out.println("3. GREEN");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		System.out.println("stop");
		break;
		case 2:
		System.out.println("ready");
		break;
		case 3:
		System.out.println("go");
		break;
		default:
		System.out.println("Wrong choice");
		}
		}


}
