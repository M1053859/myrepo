package sample;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple s=new simple("Gopal", 1053, 14000);
		simple p=new simple("deepak", 1054, 15000);

		simple d=new simple("pavan",1055, 16000);
		simple f=new simple("nagi", 1056, 18000);

		simple g=new simple("nithesh", 1057, 17000);
		simple h=new simple("Sai", 1059, 20000);
		
		Final.display(g);
		
		
		System.out.println(s.getEmployeeId()+","+s.getEmployeeName()+","+s.getEmployeesalary());
		
		System.out.println(p.getEmployeeId()+","+p.getEmployeeName()+","+p.getEmployeesalary());

		
		
		
		
		
		
	}

}
