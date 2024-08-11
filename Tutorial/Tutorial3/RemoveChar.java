package tutorial4;

import java.util.Scanner;
public class RemoveChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str=sc.nextLine();
		System.out.println("Enter the character to remove:");
		String ch=sc.nextLine();
		sc.close();
		System.out.println("The word before removing '"+ch+"':"+str);
		str=str.replace(ch,"");
		System.out.println("The word after removing '"+ch+"':"+str);
		
	}

}
