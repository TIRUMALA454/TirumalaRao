package lab5;

import java.util.Scanner;

public class ValidateAge {
	public static void main(String[] args) throws InvalidAgeException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age os a person");
		int age=scan.nextInt();
		ValidateAge v=new ValidateAge();
		v.age(age);
	}

	private void age(int age) throws InvalidAgeException {
		if(age<15) {
			throw new InvalidAgeException("person age should be greater than 15");
		}
		System.out.println("person age should be validated");
	}

}