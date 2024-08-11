package tutorial5;
class Employee{
	String empName;
	int empId;
	Employee(String empName, int empId){
		this.empId=empId;
		this.empName=empName;
	}
	void displayEmp() {
		System.out.println("The Employee Name is:"+empName);
		System.out.println("The Employee Id is:"+empId);
	}
}
class Manager extends Employee{

	String department;
	Manager(String empName,int empId, String department){
		super(empName,empId);
		this.department=department;
		this.empId=empId;
		this.empName=empName;
	}
	void displayManager() {
		System.out.println(empName+" is a Manager in "+department+", His ID is "+empId);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Employee E=new Employee("JOHN",1234);
		E.displayEmp();
		Manager M=new Manager("ROBBY",1235,"DESIGN");
		M.displayManager();
	}
}
