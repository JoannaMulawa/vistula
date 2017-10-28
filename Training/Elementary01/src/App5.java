import java.util.Scanner;

public class App5 {

	public static void main() {
		int counter = 0;
		
		Scanner keyboard = new Scanner(System.in);
		String c; 
		c = keyboard.next();
		counter++;
		while (c.equals("x") == false){
			System.out.printf(c);
			c = keyboard.next();
			counter++;
			
		}
		System.out.println(counter);
	}

}
