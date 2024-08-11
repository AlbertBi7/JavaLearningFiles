package tutorial1;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		int n,i,revNum = 0,temp,length=0;
		System.out.println("Enter the number to reverse:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		temp=n;
		while(temp!=0) {
			 temp/=10;
			 length++;
		}
		System.out.println("The number before reversing:"+n);
		for(i=0;i<length;i++) {
			int lastDigit=n%10;
			revNum=revNum*10+lastDigit;
			n=n/10;
			
		}
		System.out.println("The number after reversing:"+revNum);
		sc.close();
	}

}





