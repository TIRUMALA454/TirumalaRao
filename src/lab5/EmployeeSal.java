package lab5;

import java.util.Scanner;

public class EmployeeSal {
	public static void main(String[] args) {
		EmployeeSal e=new EmployeeSal();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee salary");
		int sal=scan.nextInt();
		try {
			e.validateSal(sal);
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}
	}

	private void validateSal(int sal) throws EmployeeException {
		if(sal<3000) {
			throw new EmployeeException("salary should be greater than 3000");
		}
		System.out.println("Accepted");
	}

}