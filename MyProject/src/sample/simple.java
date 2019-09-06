package sample;

public class simple {
	private String employeeName;
	private int employeeId;
	private int employeesalary;
	
	public simple(String employeeName, int employeeId, int employeesalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeesalary = employeesalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	

}
