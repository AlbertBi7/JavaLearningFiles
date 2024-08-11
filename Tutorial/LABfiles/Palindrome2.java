package miscellaneous;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int flag=1;
	System.out.print("Enter the string:");
	String str=sc.nextLine();
	sc.close();
	
	int l=str.length();
	for(int i=0;i<l/2;i++) {
		if((str.charAt(i))!=(str.charAt(l-1-i))) {
			flag=0;
			break;
		}	
	}
	if(flag==1) {
		System.out.println("The string is a palindrome");
		}else {
		System.out.println("The string is not a palindrome");
		}
	}
}


