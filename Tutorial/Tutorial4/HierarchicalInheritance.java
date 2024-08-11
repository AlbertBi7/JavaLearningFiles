package tutorial5;
class Employe{
	String name;
	int empId;
	String department;
	void displayEmp(String name,int empId,String department) {
		this.name=name;
		this.empId=empId;
		this.department=department;
		System.out.println("Name:"+name+"\nEmpId:"+empId+"\nDepartment:"+department);
	}
}
class FullTimeEmployee extends Employe{
	double annualSalary;
	void displaySalary(String name,int empId,String department,double annualSalary) {
		this.annualSalary=annualSalary;
		super.displayEmp(name, empId, department);
		System.out.println("Annual Salary:"+annualSalary);
	}
}
class PartTimeEmployee extends Employe{
	double hourlyRate;
	void displayRate(String name,int empId,String department,double hourlyRate) {
		this.hourlyRate=hourlyRate;
		super.displayEmp(name, empId, department);
		System.out.println("Hourly Rate:"+hourlyRate);
	}
}
public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		FullTimeEmployee F=new FullTimeEmployee();
		PartTimeEmployee P=new PartTimeEmployee();
		F.displaySalary("Rohan",123,"HR",30000.00);
		System.out.println();
		P.displayRate("Mohit", 124, "Design",300.00);
	}
} 
