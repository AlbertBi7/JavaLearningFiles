package tutorial3;
import java.util.Scanner;
public class LargestAmongUs {

	public static void main(String[] args) {
		int i, j,row,col,max;
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
		System.out.println("The greatest element in each row:");
		for(i=0;i<row;i++) {
			max=matrix[i][0];
			for(j=0;j<col;j++) {
				if(max<matrix[i][j]) {
					max=matrix[i][j];
				}
			}
			System.out.println("Row "+(i+1)+": "+max);
		}
	}
}
