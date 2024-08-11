package tutorial3;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		int i, j,row,col;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row and column of Matrix :");
		row=sc.nextInt();
		col=sc.nextInt();
		
		int[][] matrix=new int[row][col];
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(i==j) {
					matrix[i][j]=1;
				}
				else {
					matrix[i][j]=0;
				}
			}	
		}
		System.out.println("The identity matrix is:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
