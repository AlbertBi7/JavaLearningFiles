package tutorial1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int n,fact=1,i=1;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to find factorial:");
	    n=sc.nextInt();
	    while( i <= n ){  
            fact = fact * i;   
            i++;    
        }     
  
         
        System.out.println("\nFactorial of " + n + " is: " + fact);  
		
		sc.close();
		

	}

}
