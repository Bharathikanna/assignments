package week1.day2;

public class EmployeeDetails {

	public void EmployeeName() {
		String EmployeeName ="Bharathi Kanna .M";
		System.out.println("EmployeeName        :"+EmployeeName);
	}
	public void EmployeeId() {
		int EmpolyeeId = 456;
		System.out.println("EmpolyeeId          :"+EmpolyeeId);
	}
	public void EmployeeAddress() {
		String EmployeeAddress ="Salem";
		System.out.println("EmployeeAddress     :"+EmployeeAddress);
	}
	public void EmployeeSalary() {
		double EmployeeSalary =45000.4563;
		System.out.println("EmployeeSalary      :"+EmployeeSalary);
	}
	public void EmployeeMobileNumber() {
		long EmployeeMobileNumber =9789675894l;
		System.out.println("EmployeeMobileNumber:"+EmployeeMobileNumber);
	}
    public static void main(String[] args) {
    	EmployeeDetails details=new EmployeeDetails();
    	details.EmployeeName();
    	details.EmployeeId();
    	details.EmployeeAddress();
    	details.EmployeeSalary();
    	details.EmployeeMobileNumber();
    	
    }
	
}

	
	

