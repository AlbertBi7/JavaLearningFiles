package miscellaneous;
import java.util.Scanner;
public class SelectionSort {
	public static void selectionSort(int[] array) {
		int n=array.length,s = 0;
		for(int i=0;i<n-1;i++) {
			i=s;
			for(int j=i+1;j<n;j++) {
				if(array[j]>array[s]) {
					s=j;
				}	
			}
			if(i!=s) {
				int temp=array[s];
				array[s]=array[i];
				array[i]=temp;
			}
		}
	}
	public static void printArray(int[] array) {
		int n=array.length;
		 for (int i = 0; i < n; ++i) {
		        System.out.print(array[i] + " ");
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
		
		selectionSort(array);

		System.out.println("\nThe elements of the array after sorting are:");
		printArray(array);


	}

}
