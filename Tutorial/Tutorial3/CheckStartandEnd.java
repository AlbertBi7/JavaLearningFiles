package tutorial4;
import java.util.Scanner;
public class CheckStartandEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str1=sc.nextLine();
		System.out.println("The word is:"+str1);
		
		if(str1.substring(0,2).equals(str1.substring(str1.length()-2))) {
			System.out.println("The condition is satisfied.");
			
		}else {
			System.out.println("The condition is not satisfied.");
		}
		
		
		

	}

}
