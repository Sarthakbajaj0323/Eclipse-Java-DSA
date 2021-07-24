package vehicle;

public class Vehicle {
	protected String color;      //within sub class is also visible by the use of protected
	private int maxSpeed;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
	
}
   //Constructor and Inheritance
//package vehicle;
//
//public class Vehicle {
//	protected String color;
//	private int maxSpeed;
//	
//	public Vehicle(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//		System.out.println("Vehicle Constructor");
//	}
//	
//	public int getMaxSpeed() {
//		return maxSpeed;
//	}
//	
//	public void setMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//	}
//	
//	public void print() {
//		System.out.println("Vehicle color : " + color);
//		System.out.println("Vehicle Speed : " + maxSpeed);
//	}
//	
//}

   // Polymorphism
//package vehicle;
//
//public class Car extends Vehicle {
//	int numGears;
//	boolean isConvertible;
//	
//	public Car(int numGears, int maxSpeed) {
//		super(maxSpeed);
//		this.numGears = numGears;
//		System.out.println("Car Constructor");
//	}
//	
//	public boolean isConvertible() {
//		return isConvertible;
//	}
//	
//	public void print() {
//		super.print();
//		System.out.println("Car numGears : " + numGears);
//		System.out.println("Car isConvertible : " + isConvertible);
//	}
//}


