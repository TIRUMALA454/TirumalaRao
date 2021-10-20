package Pack3;

public class Company {

	public static void main(String[] args) {
		EmpDetails obj=new EmpDetails();
		System.out.println(obj.getempid());
		System.out.println(obj.getName());
		System.out.println(obj.getsalary());
		
		obj.setEmpId(1000);
		obj.setEmpName("Ram");
		obj.setEmpsalary(2100);
		
		System.out.println(obj.getempid());
		System.out.println(obj.getName());
		System.out.println(obj.getsalary());
		
	}

}
