package miscellaneous;
import java.util.Scanner;
class Queue{
	int[] QUEUE;
	int front,rear,maxSize;
	Queue(int maxSize){
		this.maxSize=maxSize;
		front=rear=-1;
		this.QUEUE=new int[maxSize];
		}
	boolean isEmpty() {
		return front==-1 || front > rear;
	}
	boolean isFull() {
		return rear==maxSize-1;
	}
	void deQueue() {
		if(isEmpty()) {
			System.out.println("UNDERFLOW..queue is empty");
		}else {
			int item=QUEUE[front++];
			System.out.println("Dequeued item is "+item);
			if(front>rear) {
				front=rear=-1;
			}
		}
	}
	void enQueue(int item) {
		if(isFull()) {
			System.out.println("OVERFLOW..queue is full");
		}else {
			    if(front==-1) {
			    	front++; 
			    }
				QUEUE[++rear]=item;
				System.out.println("Item enqueued.");
			}
		}
	void display() {
	    if (isEmpty()) {
	        System.out.println("Queue is empty.");
	    } else {
	        System.out.print("Queue elements: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(QUEUE[i] + " ");
	        }
	        System.out.println(); 
	    }
	}
}
	


public class QueueDemo {

	public static void main(String[] args) {
		Queue Q=new Queue(10);
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
			System.out.println("1)DeQueue\n2)EnQueue\n3)Display\n4)Exit\nEnter the function to perform:");
			int j=sc.nextInt();
			switch(j) {
			case 1:
				System.out.println("Enter the item to Enqueue:");
				int item=sc.nextInt();
				Q.enQueue(item);
				break;
			case 2:
				Q.deQueue();
				break;
			case 3:
				Q.display();
				break;
			
			case 4:
				System.out.println("Exiting..");
				break;
			default:
				System.out.println("Invalid choice! Please choose a valid option.");
				break;
				}
			System.out.print("Do you want to continue?(y/n)");
			choice=sc.next();
		}while(choice.toLowerCase().equals("y"));
	}
}
