package tutorial2;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		int n,i=0,min = 0,max = 0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		n=sc.nextInt();
		
		int[] array=new int[n];
		
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
	    min=array[0];
	    max=array[0];
		for(i=1;i<n;i++) {
			 if (array[i] < min) {
	                min = array[i];
	            }
	          if (array[i] > max) {
	                max = array[i];
	            }
		}
		System.out.println("The min and max values are "+min+" "+max);
	}

}
