package tutorial5;
import java.util.Scanner;
class Student {
	String name;
	String Class;
	String branch;
	Student(String name,String Class,String branch){
		this.name=name;
		this.branch=branch;
		this.Class=Class;
	}
}
class Hostler extends Student{
	String hostelName;
	Hostler(String name,String Class,String branch,String hostelName) {
		super(name,Class,branch);
		this.hostelName=hostelName;
	}
	void display() {
		System.out.println("--Student Details--");
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		System.out.println("Class:"+Class);
		System.out.println("Student is a Hostler-");
		System.out.println("Hostel Name:"+hostelName);
	}
	
}
class DayScholar extends Student{
	String busRoute;
	DayScholar(String name,String Class,String branch,String busRoute) {
		super(name,Class,branch);
		this.busRoute=busRoute;
	}
	void display() {
		System.out.println("--Student Details--");
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		System.out.println("Class:"+Class);
		System.out.println("-Student is a Day Scholar-");
		System.out.println("Bus Route:"+busRoute);
	}
	
}
public class StudentDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hostler H;
		DayScholar DS;
		String choice;
		
		do{
			
			System.out.print("Are you a Dayscholar or Hostler:");
			String type=sc.nextLine();
		
			System.out.print("Enter name:");
			String name=sc.nextLine();
			System.out.print("Enter Branch:");
			String branch=sc.nextLine();
			System.out.print("Enter class:");
			String Class=sc.nextLine();
			
			if(type.toLowerCase().equals("dayscholar")||type.toLowerCase().equals("day scholar")){
				System.out.print("Enter Bus Route:");
				String busRoute=sc.nextLine();
				DS=new DayScholar(name,Class,branch,busRoute);
				DS.display();
				
			}
			else if(type.toLowerCase().equals("hostler")) {
				System.out.print("Enter Hostel Name:");
				String hostelName=sc.nextLine();
				H=new Hostler(name,Class,branch,hostelName);
				H.display();
			}
			System.out.println("DO YOU WANT TO CONTINUE?(y/n)");
			choice=sc.nextLine();
			
		}while(choice.toLowerCase().equals("y"));
		
	}
	
}
