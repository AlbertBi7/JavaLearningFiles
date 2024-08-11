package tutorial2;

import java.util.Scanner;
public class SumDiagonals {

	public static void main(String[] args) {
		int i,j,row,col,diagonal1Sum=0,diagonal2Sum=0;
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
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(i==j) {
				diagonal1Sum+=matrix[i][j];
				}
				if((i+j)==col-1) {
					diagonal2Sum+=matrix[i][j];
				}
			}
		}
		System.out.println("The sum of the diagonal 1 of the matrix is:"+diagonal1Sum);
		System.out.println("The sum of the diagonal 2 of the matrix is:"+diagonal2Sum);
	}
}
