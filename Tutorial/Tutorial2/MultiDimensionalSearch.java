package tutorial2;
import java.util.Scanner;
public class MultiDimensionalSearch {
	public static void main(String[] args) {
		int i,j,row,col,x,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns of the matrix:");
		row=sc.nextInt();
		col=sc.nextInt();
		
		int[][] matrix=new int[row][col];
		
		System.out.println("Enter the elements of the  matrix:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the number to search:");
		x=sc.nextInt();
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(x==matrix[i][j]) {
					flag=1;
					System.out.println("The element "+x+" is found at index:{"+i+","+j+"}");
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("The element not found");
		}
	}

}
