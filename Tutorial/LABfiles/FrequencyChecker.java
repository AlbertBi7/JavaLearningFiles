package miscellaneous;
import java.util.Scanner;
public class FrequencyChecker {

	
	public static void main(String[] args) {
		int i,freq=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str=sc.nextLine();
		
		System.out.println("Enter the letter to check frequency of:");
		
		String temp=sc.next();
		sc.close();
		char find=temp.charAt(0);
		
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==find) {
				freq++;
			}
		}
		System.out.println("count is "+freq);
		
	}

}
