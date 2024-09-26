package miscellaneous;

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("This animal has no legs");
	}
}
class Spider extends Animal{
	Spider(){
		super(8);
		System.out.println("SPIDER");
	}
	void eat() {
		System.out.println("Spider eats insects.");
	}
	void walk() {
		System.out.println("This animal walks by "+legs+" legs");
	}
}
interface Pet {
	void getname();
	void setName(String Name);
	void play();
}
class Cat extends Animal implements Pet{

	Cat(String name) {
		super(4);
		this.name=name;
		System.out.println("CAT");
		
	}
	Cat(){
		this("");
	}
	
	String name;
	
	public void getname() {
		System.out.println("The cat's name is "+name);
		
	}
	public void setName(String Name) {
		System.out.println("The cats name is "+Name);
		
	}
	public void play() {
		System.out.println("Cat plays with rats.");	
	}
	void eat() {
		System.out.println("Cat eats fishes.");
	}
	void walk() {
		System.out.println("This animal walks by "+legs+" legs");
	}
}
class Fish extends Animal implements Pet{

	 Fish(String name) {
		super(0);
		this.name=name;
		System.out.println("FISH");
		
	}
	String name;
	Fish(){
		this("");
	}
	
	public void getname() {
		System.out.println("The fish's name is "+name);
	}

	
	 public void setName(String Name) {
		System.out.println("The fish's name is "+Name);
		
	}


	public void play() {	
	}
	void eat() {
		System.out.println("Fish eats plants.");
		
	}
	
}

public class InterfaceLab {

	public static void main(String[] args) {
		Fish F=new Fish("Mimi");
		F.getname();
		F.walk();
		F.play();
		F.eat();
		F.setName("Momo");
		Cat C = new Cat("Fluffy");
		C.getname();
		C.walk();
		C.play();
		C.eat();
		C.setName("Moose");
		Spider S = new Spider();
		S.walk();
		S.eat();
//		Animal P=new Fish();
//		P.walk();
//		
		 
	}

}