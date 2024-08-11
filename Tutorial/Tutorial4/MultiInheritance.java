package tutorial5;
class Vehical{
	String model;
	int year;
	void vehical(String model,int year){
		this.model=model;
		this.year=year;
	}
	void displayModel() {
		System.out.println("The Model is "+model+" and Year is "+year);
	}
}
class Car extends Vehical{
	int numDoors;
	void displayDoors() {
		System.out.println("The Number of Doors is "+numDoors);
	}
}
class ElectricCar extends Car{
	int batteryCapacity;
	void displayCapacity() {
	System.out.println("The Battery Capacity is "+batteryCapacity+"KW");
	}
}
public class MultiInheritance {
	public static void main(String[] args) {
		Vehical V=new Vehical();
		V.vehical("MG HECTOR", 2024);
		V.displayModel();
		Car C=new Car();
		C.numDoors=4;
		C.displayDoors();
		ElectricCar E=new ElectricCar();
		E.batteryCapacity=30000;
		E.displayCapacity();
	}
}
