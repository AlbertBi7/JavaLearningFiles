package tutorial4;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string to reverse:");
		String str=sc.nextLine();
		sc.close();
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println("The original string is:"+str);
		System.out.println("The reversed string is:"+rev);
	}
}
