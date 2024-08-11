package tutorial2;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			sum+=array[i];
		}
		System.out.print("The sum of the elements of the array are:"+sum);
		
	}

}
