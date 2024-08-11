package miscellaneous;
import java.util.Scanner;

public class SparseMatrix {
	public static void printArray(int[][] array,int row,int col) {
		for (int i = 0; i < row; ++i) {
			 for(int j=0; j<col;j++) {
		        System.out.print(array[i][j] + " ");
			 }
			 System.out.println();
		}
	}
	public static int[][] sparseMatrix(int[][] array,int row,int col,int count) {
		int k=1;
		int[][] sparseMatrix=new int[count+1][3];
		sparseMatrix[0][0]=row;
		sparseMatrix[0][1]=col;
		sparseMatrix[0][2]=count;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(array[i][j]!=0) {
					sparseMatrix[k][0]=i;
					sparseMatrix[k][1]=j;
					sparseMatrix[k][2]=array[i][j];
					k++;
				}
			}
		}
		return sparseMatrix;
	}

	public static void main(String[] args) {
		int row , col,count=0,i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array:");
		 row=sc.nextInt();
		col=sc.nextInt();
		int[][] array=new int[row][col];
		
		System.out.print("Enter the elements in the array:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				array[i][j]=sc.nextInt();
				if(array[i][j]!=0) {
					count++;
				}
			}		
		}
		System.out.println("The Matrix is:");
		printArray(array,row,col);
	    int[][] sparseMatrix = sparseMatrix(array, row, col, count);
	
		System.out.println("Row\tColumn\tValues");
		for(i=0;i<count+1;i++) {
			for(j=0;j<3;j++) {
			System.out.print(sparseMatrix[i][j]+"\t");
			}
			System.out.print("\n");
		}

	}

}
