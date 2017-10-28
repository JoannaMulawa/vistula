class Account {
	String  number;
	double balance;
	String name;
	int password;
	int login;
}


class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contaian
	
	// 1. Data
	// 2. Subroutines (methods)
}


public class App {

	public static void main(String[] args) {

		Person asia = new Person();
		asia.name = "Joanna Mulawa";
		asia.age = 35;
		
		Person cypus = new Person();
		cypus.name = "Cyprian Mulawa";
        cypus.age = 8;
        
		System.out.println(asia.age);
		System.out.println(cypus.age);
		
		System.out.printf("Joanna Mulawa %d \nCyprian Mulawa %d", asia.age, cypus.age);
		
		
		Account good = new Account();
		good.name = "Dobre konto";
		good.password = 12345;
		good.login = 99;
		good.balance = 1550.50;
		
		
	}

}
