package tutorial3;
import java.util.Scanner;
public class ScalarMultipliyMatrix {

	public static void main(String[] args) {
		int i, j,row,col;
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
		System.out.println("Enter the scalar value to multiply with the matrix:");
		int n=sc.nextInt();
		int[][] matrix2=new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix2[i][j]=n*matrix[i][j];
			}	
		}
		System.out.println("The matrix after Multiplication is:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
