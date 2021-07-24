package vehicle;


	public class Car extends Vehicle {
		int numGears;
		boolean isConvertible;
		
		public void print() {
			System.out.println("Car color : " + color);    //we can write super.print() also for both the lines
			System.out.println("Car Speed : " + getMaxSpeed());        
			System.out.println("Car numGears : " + numGears);
			System.out.println("Car isConvertible : " + isConvertible);
		}
	}
	// Constructor ad inheritance
//	package vehicle;
//
//	public class Car extends Vehicle {
//		int numGears;
//		boolean isConvertible;
//		
//		public Car(int numGears, int maxSpeed) {
//			super(maxSpeed);
//			this.numGears = numGears;
//			System.out.println("Car Constructor");
//		}
//		
//		public void print() {
//			super.print();
//			System.out.println("Car numGears : " + numGears);
//			System.out.println("Car isConvertible : " + isConvertible);
//		}
//	}

      //Polymorphism	
//	package vehicle;
//
//	public class Car extends Vehicle {
//		int numGears;
//		boolean isConvertible;
//		
//		public Car(int numGears, int maxSpeed) {
//			super(maxSpeed);
//			this.numGears = numGears;
//			System.out.println("Car Constructor");
//		}
//		
//		public boolean isConvertible() {
//			return isConvertible;
//		}
//		
//		public void print() {
//			super.print();
//			System.out.println("Car numGears : " + numGears);
//			System.out.println("Car isConvertible : " + isConvertible);
//		}
//	}
