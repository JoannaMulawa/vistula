class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
		
	}
	int getAge(){
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class App {

	public static void main(String[] args) {
		Person woody = new Person();
		woody.name = "Woody Allen";
		woody.age = 45;
		
		// woody.speak();
		
		int years = woody.calculateYearsToRetirement();
		System.out.println("Years till retirement " + years);
		
		int age = woody.getAge();
		String name = woody.getName();
		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);

	}

}
