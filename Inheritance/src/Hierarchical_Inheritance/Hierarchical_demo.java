package Hierarchical_Inheritance;

public class Hierarchical_demo {
	
public static void main(String[] args) {
		
		
		Person p1=new Person();
		System.out.println("------Person Details ------");
		System.out.println(p1);
		
		System.out.println("--------------------------");
		//Student s=new Student();
		Person p;
		p=new Person("Romaan", "mumbai");
		System.out.println("Person Details "+ p);
		
		p=new Student("Rahul", "Nashik", "TY", 67.60f);
		System.out.println("Students details "+ p);
		
		p=new Employee("Yash", "Nagpur", 1002, 450000, "Development");
		System.out.println("employee details "+ p);
		


		
	}
}
