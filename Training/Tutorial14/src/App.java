
class Person {
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain
	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old");
		}
	}
		
	void sayHello(){
		System.out.println("Hello there");
	}
		
}
	
public class App {

	public static void main(String[] args) {

		// Create a Person object using the Person class
		Person max = new Person();
		max.name = "Maksymilian Mulawa 汉字";
		max.age = 35;
		max.speak();
		max.sayHello();
	

		Person bianka = new Person();
		bianka.name = "Bianka Mulawa";
		bianka.age = 6;
		bianka.speak();
		bianka.sayHello();
	}

}
