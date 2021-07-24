package classes_and_objects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Student s1 = new Student();
		s1.name = s.next();
		s1.rollNumber = 123;
		
		Student s2 = new Student();
		s2.name = s.next();
		s2.rollNumber = 121;
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		//System.out.println(s1);
	}

}
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	
//	Student s1 = new Student();
//	s1.name = "Ankush";
//	s1.setRollnumber(-123);
//	
//	Student s2 = new Student();
//	s2.name = "Manisha";
//	s2.setRollnumber(121);
//	
//	System.out.println(s1.name);
//	System.out.println(s2.name);
//	System.out.println(s1.getRollNumber());
////	//System.out.println(s1);
//}



// CONSTRUCTOR


//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	
//	Student s1 = new Student("Ankush", 123);
//	//System.out.println(s1);
////	System.out.println(s1.name);
////	System.out.println(s1.getRollNumber());
//	s1.print();
//	
//	Student s2 = new Student("Manisha", 121);
//	//System.out.println(s2);
//	s2.print();
////	System.out.println(s1.name);
////	System.out.println(s2.name);
////	System.out.println(s1.getRollNumber());
////	//System.out.println(s1);
//}

//IMPORT KEYWORDS
//package classes_and_objects;
//
//import java.util.Scanner;
//
//public class StudentUse {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		Student s1 = new Student("Ankush", 123);
//		//System.out.println(s1);
////		System.out.println(s1.name);
////		System.out.println(s1.getRollNumber());
//		s1.print();
//		
//		Student s2 = new Student("Manisha", 121);
//		//System.out.println(s2);
//		s2.print();
//		
////		System.out.println(s1.numStudents);
////		System.out.println(s2.numStudents);
//		System.out.println(Student.getNumStudents());
//		//System.out.println(s1.getNumStudents());
//		
//		System.out.println(s1.name);
//		
////		System.out.println(s1.name);
////		System.out.println(s2.name);
////		System.out.println(s1.getRollNumber());
////		//System.out.println(s1);
//	}
//
//}
