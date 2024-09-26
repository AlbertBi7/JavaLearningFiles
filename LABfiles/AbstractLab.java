package miscellaneous;

import java.util.Scanner;
abstract class Shape{
	abstract void numberofSides();
}
class Rectangle extends Shape{
	int sides;
	
	Rectangle(int side){
		sides=side;
	}
	void numberofSides() {
		System.out.println("Shape with "+sides+" sides:");
		System.out.println("I am a Rectangle and I have "+sides+" sides.");
		int sum=(sides-2)*180;
		System.out.println("Sum of Angles="+sum);
	}
}
class Triangle extends Shape{
	int sides;
	Triangle(int side){
		sides=side;
	}
	void numberofSides() {
		System.out.println("Shape with "+sides+" sides:");
		System.out.println("I am a Triangle and I have "+sides+" sides.");
		int sum=(sides-2)*180;
		System.out.println("Sum of Angles="+sum);
	}
}
class Hexagon extends Shape{
	int sides;
	Hexagon(int side){
		sides=side;
	}
	void numberofSides() {
		System.out.println("Shape with "+sides+" sides:");
		System.out.println("I am a Hexagon and I have "+sides+" sides.");
		int sum=(sides-2)*180;
		System.out.println("Sum of Angles="+sum);
	}
}
public class AbstractLab {


	public static void main(String[] args) {
		String choice;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		do {
		System.out.print("Enter the number of sides for the geometric shape:");
		int side=sc.nextInt();
		if(side==3) {
			Triangle T=new Triangle(3);
			T.numberofSides();
		}
		else if(side==4) {
			Rectangle R=new Rectangle(4);
			R.numberofSides();			
		}
		else if(side==6){
			Hexagon H=new Hexagon(6);
			H.numberofSides();
		}
		else {
			System.out.println("Shape with "+side+" sides is not supported.");
		}
		sc.nextLine();
		System.out.println("Do you want to continue:(y/n)");
		choice=sc.nextLine();
		}while(choice.toLowerCase().equals("y"));
		System.out.println("Exiting....");
		
	}

}
