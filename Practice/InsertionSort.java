package miscellaneous;

import java.util.Scanner;

public class InsertionSort {
		
	public static void printArray(int[] array) {
	    int n = array.length;
	    for (int i = 0; i < n; ++i)
	        System.out.print(array[i] + " ");
	   
	}
 
	public static void insertionSort(int[] array) {
		int i,j;
			int n=array.length;
			for(i=1;i<n;i++) {
				int temp=array[i];
				for(j=i-1;j>=0&&temp<array[j];j--) {
					array[j+1]=array[j];
				}
				array[j+1]=temp;
			}
		}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		
		System.out.print("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("The elements of the array b4 sorting are:");
		printArray(array);
		
		insertionSort(array);

		System.out.println("\nThe elements of the array after sorting are:");
		printArray(array);
	}

}
