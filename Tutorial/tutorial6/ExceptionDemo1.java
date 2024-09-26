package tutorial6;
import java.util.Scanner;

class InvalidNumberException extends Exception{
	private String message;
	public InvalidNumberException(String msg){
		message=msg;
	}
	public String getMessage(){
		return message;
	}
}
public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,count=0;
		System.out.print("Enter the number of integers to take sum of:");
		int N=sc.nextInt();
		int[] arrayN=new int[N];
		System.out.println("Enter "+N+" numbers");
		for(int i=0;i<N;i++) {
			arrayN[i]=sc.nextInt();
		}
		System.out.println("Numbers are");
		for(int i=0;i<N;i++) {
				try {
					if(arrayN[i]<=0) {
					throw new InvalidNumberException("Invalid Number "+arrayN[i]);
				}	
				else {
					System.out.println(arrayN[i]);
					sum+=arrayN[i];
					count++;
				}
			}
		catch(InvalidNumberException e){
			System.out.println(e.getMessage());
		}   
		
	}
		System.out.println("\nSum of positive numbers is:"+sum);
		System.out.println("The average of these numbers is:"+sum/count);
	}
}
