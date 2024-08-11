package labPrograms24;
import java.util.Scanner;

class Employee{
	String name;
	int age;
	long phno;
	double salary;
	String address;
	void printSalary() {
		System.out.println("Salary:"+ salary);
	}
	void printEmployee() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone Number:"+phno);
		System.out.println("Address:"+address);
		
	}
	
}
class Officer extends Employee{
	String spcl;
	void printSpecialization() {
		
		System.out.println("Specialization:"+spcl);
	}
	
}
class Manager extends Employee{
	String department;
	void printDepartment() {
		
		System.out.println("Department:"+department);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Officer O=new Officer();
		Manager M=new Manager();
		System.out.println("-Enter details of Offcier-");
		System.out.print("Enter the Name of Offcier:");
		O.name=sc.nextLine();
		System.out.print("Enter the Age of Offcier:");
        O.age=sc.nextInt();
    	System.out.print("Enter the Phone Number of Offcier:");
		O.phno=sc.nextLong();
		System.out.print("Enter the Salary of Offcier:");
		O.salary=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the Address of Offcier:");
		O.address=sc.nextLine();
		System.out.print("Enter the Specialization of Offcier:");
		O.spcl=sc.nextLine();
		System.out.println("-Enter details of Manger-");
		System.out.print("Enter the Name of Manager:");
		M.name=sc.nextLine();
		System.out.print("Enter the Age of Manager:");
        M.age=sc.nextInt();
    	System.out.print("Enter the Phone Number of Manager:");
		M.phno=sc.nextInt();
		System.out.print("Enter the Salary of Manger:");
		M.salary=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the Address of Manager:");
		M.address=sc.nextLine();
		System.out.print("Enter the Department of Manager:");
		M.department=sc.nextLine();
		System.out.println("\n-The details of Officer");
		O.printEmployee();
		O.printSalary();
		O.printSpecialization();
		System.out.println("\n-The details of Manger-");
		M.printEmployee();
		M.printSalary();
		M.printDepartment();
	}
}
