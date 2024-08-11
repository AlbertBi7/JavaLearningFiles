package tutorial3;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		int i, j,row,col,flag=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row and column of Matrix :");
		row=sc.nextInt();
		col=sc.nextInt();
		
		int[][] matrix=new int[row][col];
		System.out.println("Enter the elements of the  matrix :");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(matrix[i][j]!=matrix[j][i]) {
					flag=0;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println("The matrix is Symmetric");
		}
		else {
			System.out.println("The matrix is Not Symmetric");
		}

	}

}
