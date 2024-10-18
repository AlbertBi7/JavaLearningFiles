package labPrograms24;
import java.util.Random;


class SquareThread extends Thread{
	int n;
	SquareThread(int n){
		this.n=n;
	}
	public void run() {
		System.out.println("Sqaure of "+n+"= "+n*n);
	}
	
}
class CubeThread extends Thread{
	int n;
	CubeThread(int n){
		this.n=n;
	}
	public void run() {
		System.out.println("Cube of "+n+"= "+n*n*n);
	}
	
}
class RandomThread extends Thread
{
	public void run() 
	{
	for(int i=1;i<=10;i++) 
	{
		Random rnd=new Random();
		int randomNumber=rnd.nextInt(100);
		if(randomNumber%2==0) 
		{ 
			new SquareThread(randomNumber).start();
			
		}else {
			
			new CubeThread(randomNumber).start();
		}
	}
	
	
}
}

public class MultiThreadLAb {

	public static void main(String[] args) {
		new RandomThread().start(); 

	}
}

