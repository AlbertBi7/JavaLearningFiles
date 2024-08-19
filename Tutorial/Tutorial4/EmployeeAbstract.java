package tutorial5;
import java.util.Scanner;
abstract class Employee{
	String Name;
	abstract void calculateMonthlySalary();
}
class FullTimeEmployee extends Employee{
	final double HRA=1000;
	double Salary;
	FullTimeEmployee(String Name,double Salary){
		this.Name=Name;
		this.Salary=Salary+HRA;
	}
	void calculateMonthlySalary() {
		System.out.println(Name+"'s Salary: Rs."+Salary);
	}
}
class PartTimeEmployee extends Employee{
	final int days=25;
	double hourlyWage;
	int workedPerDay;
	PartTimeEmployee(String Name,double hourlyWage, int workedPerDay){
		this.Name=Name;
		this.hourlyWage=hourlyWage;
		this.workedPerDay=workedPerDay;
	}
	void calculateMonthlySalary() {
		System.out.println(Name+"'s Salary: Rs."+hourlyWage*workedPerDay*days);
	}
}
class Intern extends Employee{
	double stipend;
	Intern(String Name,double stipend){
		this.Name=Name;
		this.stipend=stipend;
	}
	void calculateMonthlySalary() {
		System.out.println(Name+"'s Stipend: Rs."+stipend);
	}
}
public class EmployeeAbstract {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
			System.out.print("Enter Employee Name:");
			String name=sc.nextLine();
			System.out.print("Enter Employee Job Type (full-time,part-time,intern):");
			String type=sc.nextLine();
			if (type.equalsIgnoreCase("full-time")){
				System.out.print("Enter the monthly Salary:");
				double salary=sc.nextDouble();
				FullTimeEmployee FTE=new FullTimeEmployee(name,salary);
				FTE.calculateMonthlySalary();
			}
			else if(type.equalsIgnoreCase("part-time")) {
				System.out.print("Enter hourly wage:");
				double hourlyWage=sc.nextDouble();
				System.out.print("Enter number of hours worked/day:");
				int workedPerDay=sc.nextInt();
				PartTimeEmployee PTE=new PartTimeEmployee(name,hourlyWage,workedPerDay);
				PTE.calculateMonthlySalary();
			}
			else if(type.equalsIgnoreCase("intern")) {
				System.out.print("Enter the stipend amount:");
				double stipend=sc.nextDouble();
				Intern I=new Intern(name,stipend);
				I.calculateMonthlySalary();
			}
			else {
				System.out.println("Invalid option!");
			}
			sc.nextLine();
			System.out.println("Do you want to Continue?(y/n)");
			choice=sc.nextLine();
		}while(choice.equalsIgnoreCase("y"));
	}
}
