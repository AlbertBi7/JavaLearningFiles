package miscellaneous;
import java.util.Scanner;
public class MatrixMultiplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i, j,rowA,colA,rowB,colB;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row and column of Matrix 1:");
		rowA=sc.nextInt();
		colA=sc.nextInt();
		int[][] matrixA = new int[rowA][colA];
		
		System.out.println("Enter the row and column of Matrix 2:");
		rowB=sc.nextInt();
		colB=sc.nextInt();
		int[][] matrixB = new int[rowB][colB];
		
		if(!(rowB==colA)) {
			System.out.println("Not possible to multiply");
			return;
		}
		else {
			int[][] matrixC=new int[rowA][colB];
			System.out.println("Enter the elements of the  matrix A:");
			for(i=0;i<rowA;i++) {
				for(j=0;j<colA;j++) {
					matrixA[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of the  matrix B:");
			for(i=0;i<rowB;i++) {
				for(j=0;j<colB;j++) {
					matrixB[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<rowA;i++) {
				for(j=0;j<colA;j++) {
					
					for(int k=0;k<rowB;k++) {
						matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
					}
					
					
				}
			}
		
			System.out.println("The matrix A is:");
			for(i=0;i<rowA;i++) {
				for(j=0;j<colA;j++) {
					System.out.print(matrixA[i][j]+" ");
				}
				System.out.print("\n");
			}
			
			System.out.println("The matrix B is:");
			for(i=0;i<rowB;i++) {
				for(j=0;j<colB;j++) {
					System.out.print(matrixB[i][j]+" ");
				}
				System.out.print("\n");
			}
			
			System.out.println("The matrix C is:");
			for(i=0;i<rowA;i++) {
				for(j=0;j<colA;j++) {
					System.out.print(matrixC[i][j]+" ");
				}
				System.out.print("\n");
			}
		

		}

	
		//sc.close();
	}

}
