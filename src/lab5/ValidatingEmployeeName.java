package lab5;

import java.util.Scanner;

public class ValidatingEmployeeName {
	public static void main(String[] args) throws InvalidNameException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employye first name");
		String firstName=scan.nextLine();
		System.out.println("Enter the employee second name");
		String secondName=scan.nextLine();
		ValidatingEmployeeName e=new ValidatingEmployeeName();
		e.employeeName(firstName,secondName);
		
	}

	private void employeeName(String firstName, String secondName) throws InvalidNameException {
		if(firstName.isEmpty()||secondName.isEmpty()) {
			throw new InvalidNameException("Enter valid name");
		}
		System.out.println(firstName+" "+secondName);
	}

}