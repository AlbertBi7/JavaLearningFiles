package miscellaneous;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string to reverse:");
		String str=sc.nextLine();
		sc.close();
		String rev="";
		for(int i=0;i<str.length()/2;i++) {
			rev=str.charAt(i)+rev;
		}
		if(str.equals(rev)) {
		System.out.println("The string is a palindrome");
		}else {
		System.out.println("The string is not a palindrome");
		}
	}
}
