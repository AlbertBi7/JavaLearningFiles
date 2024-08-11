package tutorial4;

import java.util.Scanner;

public class RemoveStartAndEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=1;
		
		System.out.println("Enter the word:");
		String str1=sc.nextLine();
		System.out.println("The word is:"+str1);
		
		
		if(str1.charAt(0)==(str1.charAt(str1.length()-1))) {
			flag=0;
		}
		if(flag==1) {
			System.out.println("The condition is satisfied.The word after removing the first and last letters is "+str1.substring(1,str1.length()-1));
		}else {
			System.out.println("The condition is satisfied.The word after removing the first and last letters is "+str1.substring(1,str1.length()-1));
		}
		

	}

}
