package labPrograms24;
import java.util.Scanner;


class thread1 extends Thread{
	int n;
	thread1(int n){
		this.n=n;
	}
	public void run() {
		synchronized(thread1.class){
			for(int i=1;i<=5;i++) {
				System.out.println(i+"+"+n+" = "+(i+n));
			}
		}
	}
}


public class ThreadSyncLab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tabel you want to run using thread1");
		int num1=sc.nextInt();
		thread1 t1=new thread1(num1);
		
		System.out.println("Enter the tabel you want to run using thread2");
		int num2=sc.nextInt();
		thread1 t2=new thread1(num2);
	
		System.out.println("Enter the tabel you want to run using thread3");
		int num3=sc.nextInt();
		thread1 t3=new thread1(num3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
