package miscellaneous;
import java.util.Scanner;
 

public class ExceptionLab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice;
		int option;
		
		do {
			System.out.print("1)Arithmetic Exception\n2)Array Index Out Of Bound Exception\nEnter operation to perform:- ");
			option=sc.nextInt();
			
			try {
				switch(option) {
					case 1:
						System.out.println("Program to perform Division");
						System.out.print("Enter number-1:");
						int num1=sc.nextInt();
						System.out.print("Enter number-2:");
						int num2=sc.nextInt();
						int result=num1/num2;
						System.out.println("Result="+result);
						break;
					case 2:
						System.out.print("Enter the number of elements you want to store:");
						int arrayLength=sc.nextInt();
						int[] array=new int[arrayLength];
						System.out.print("Enter the elements of the array:");
						for(int i=0;i<arrayLength;i++) {
							array[i]=sc.nextInt();
						}
						System.out.println("Array length:"+arrayLength);
						System.out.print("Array elements are:");
						for(int i=0;i<arrayLength;i++) {
							System.out.print(array[i]+"\t");
						}
						
						System.out.print("\nEnter the position of element to be accessed:");
						int find=sc.nextInt();
						System.out.println("Element at position "+find+"is "+array[find]);
						break;
					}
				}catch(Exception e) {
					 System.out.println(e);
				}finally {
					System.out.print("finally block content\nMy code is safe from execution\n");
				}
			
			
				
			System.out.println("Do you want to continue(y/n)?");
			choice=sc.next();
		}while(choice.toLowerCase().equals("y"));

	}

}
