package miscellaneous;
import java.util.Scanner;
class Addition{
	int num1;
	int num2;
	int addition(int a,int b) {
		return a+b;	
	}
}
public class SumWithClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Addition add=new Addition();
		int result=add.addition(2,3);
		System.out.print("The result is:"+result);
		
	}

}
