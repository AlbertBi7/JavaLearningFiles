package miscellaneous;

import java.util.Scanner;

public class OverloadExample {
	public  int sum(int a ,int b) {
		return a+b;
	}
	public String sum(String a,String b) {
		return a+b;
	}
	public int sum(int a) {
		return ++a;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		OverloadExample example=new OverloadExample();
		System.out.print("Enter first integers:");
		int num1=sc.nextInt();
		System.out.print("Enter second integers:");
		int num2=sc.nextInt();
		int integerResult=example.sum(num1,num2);
		
		System.out.print("Enter first string:");
		String str1=sc.next();
		System.out.print("Enter second string:");
		String str2=sc.next();
		String stringResult=example.sum(str1,str2);
		
		System.out.print("Enter integer to increment:");
		int num=sc.nextInt();
		int incrementResult=example.sum(num);
		
		System.out.println("The sum of interger is:"+integerResult);
		System.out.println("The concat of strings is:"+stringResult);
		System.out.println("The incremented integer is:"+incrementResult);
		

	}

}
