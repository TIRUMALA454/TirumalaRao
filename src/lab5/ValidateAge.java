package lab5;

import java.util.Scanner;

public class ValidateAge {
	public static void main(String[] args) throws InvaliAgeException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age os a person");
		int age=scan.nextInt();
		ValidateAge v=new ValidateAge();
		v.age(age);
	}

	private void age(int age) throws InvaliAgeException {
		if(age<15) {
			throw new InvaliAgeException("person age should be greater than 15");
		}
		System.out.println("person age should be validated");
	}

}