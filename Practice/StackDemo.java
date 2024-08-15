package miscellaneous;
import java.util.Scanner;
class Stack{
	int maxSize;
	int[] STACK;
	int top=-1;
	int count=0;
	Stack(int maxSize){
		this.maxSize=maxSize;
		this.STACK=new int[maxSize];
	}
	 void push(int item) {
		if(isFull()) {
			System.out.println("OVERFLOW..stack is full.");
		}else {
			STACK[++top]=item;
			System.out.println("Item is pushed.");
		}
	}
	 void pop() {
		if(isEmpty()) {
			System.out.println("UNDERFLOW..stack is empty.");
		}else { 
		   int item=STACK[top--];
		   System.out.println("POP item is "+item);
		}
	}
	 boolean isFull() {
		return top==maxSize-1;
	}
	 boolean isEmpty() {
		return top==-1;
	}
	 void displayStack() {
		for(int i=0;i<=top;i++) {
			count++;
			System.out.print(STACK[i]+" ");
		}
		System.out.println("Size is "+count);
	}
}
public class StackDemo {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack stack=new Stack(10);
		String choice;
		do {
			System.out.println("1)PUSH\n2)POP\n3)isEmpty\n4)Size\n5)Exit\nEnter the function to perform:");
			int j=sc.nextInt();
			switch(j) {
			case 1:
				System.out.println("Enter the item to PUSH:");
				int item=sc.nextInt();
				stack.push(item);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				if(stack.isEmpty()) {
					System.out.println("UNDERFLOW..stack is empty.");
				}else{
					System.out.println("Stack is not empty.");
				};
				break;
			case 4:
				stack.displayStack();
				break;
			case 5:
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
