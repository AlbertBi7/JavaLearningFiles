package miscellaneous;

import java.util.Scanner;

public class Area {
	public float area(float a,float b) {
		return 0.5f*a*b;
	}
	public int area(int a,int b) {
		return a*b;
	}
	public double area(double radius) {
		return Math.PI*radius*radius;
	}
	public float area(int a,int b,int c) {
		return ((a+b)/2)*c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area result=new Area();
		System.out.println("Enter the Base of the triangle:");
		float baseTriangle=sc.nextFloat();
		System.out.println("Enter the Height of the triangle:");
		float heightTriangle=sc.nextFloat();
		float result1=result.area(baseTriangle,heightTriangle);
		
		System.out.println("Enter the width of the Rectangle:");
		int widthRectangle=sc.nextInt();
		System.out.println("Enter the Height of the Rectangle:");
		int heightRectangle=sc.nextInt();
		int result2=result.area(widthRectangle,heightRectangle);
		
		System.out.println("Enter the Radius of the Circle:");
		double radius=sc.nextDouble();
		double result3=result.area(radius);
		
		System.out.println("Enter the length of Parallel sides, height  of the Trapezium:");
		int side1Trapezium=sc.nextInt();
		int side2Trapezium=sc.nextInt();
		int heightTrapezium=sc.nextInt();
		float result4=result.area(side1Trapezium,side2Trapezium,heightTrapezium);
		

		System.out.printf("The area of the triangle with base %.2f and height %.2f is: %.2f%n", baseTriangle, heightTriangle,result1);
		System.out.printf("The area of the triangle with width %d and height %d is: %d%n",  widthRectangle, heightRectangle,result2);
		System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, result3);
		System.out.printf("The area of the Trapezium with sides %d and %d and height %d is: %.2f%n",side1Trapezium,side2Trapezium,side2Trapezium,result4);
		
	}

}
