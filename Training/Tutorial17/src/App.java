class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}
	

public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog();
		//frog1.name = "Bertie";
		//frog1.age = 1;
		
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		frog1.setInfo("Dupa", 34);
		System.out.println(frog1.getAge());
	}

}
