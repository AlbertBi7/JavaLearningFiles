package miscellaneous;
import java.util.Scanner;
class Employee1{
	float salary,GP;
	int DA,HRA;
	
	
	Employee1(float salary,int DA,int HRA){
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
		
	}
	//
	void display() {
		System.out.println("....EMPLOYEE....");
	}
	void calcSalary() {
		GP = salary+salary*DA/100+salary*HRA/100;
		System.out.println("The GROSS Salary of Employee is "+GP);
		
	}
}

class Engineer extends Employee1{

	Engineer(float salary, int DA, int HRA) {
		super(salary,DA,HRA);
	}
	void display() {
		super.display();
		
		super.calcSalary();
		System.out.println("....ENGINEER....");
	}
	
	void calcSalary() {
		System.out.print("The GROSS Salary of Engineer is "+GP*2);
	}
	
}
public class InheritanceLab {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Basic Salary of Employee:");
		float salary=sc.nextFloat();
		System.out.print("Enter the DA% of Employee:");
		int DA=sc.nextInt();
		System.out.print("Enter the HRA% of Employee:");
		int HRA=sc.nextInt();
		Engineer cls=new Engineer(salary,DA,HRA);
		
		cls.display();
		cls.calcSalary();
		

	}

}
