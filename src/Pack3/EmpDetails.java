package Pack3;

public class EmpDetails {
	private int empid; 
    private String empname;
	private int empsalary;

	
	
	
	// Getters & Setters
	
	public int getempid() {
		return empid;
	}
	
	public void setEmpId(int empId) {
		this.empid = empId;
	}
	public String getName() {
		return empname;
	}
	public void setEmpName(String empname) {
		this.empname = empname;
	}
	public int getsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}



	@Override
	public String toString() {
		return "EmpDetails [stdId=" + empid + ", name=" + empname + ", age=" +empsalary + "]";
	} 


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
