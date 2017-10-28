import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a number: ");
		
		//Wait for the user to enter a number.
		if (input.hasNextInt()){
			int value = input.nextInt();
			System.out.println(value);
		}else if(input.hasNextDouble()){
			double value = input.nextDouble();
			System.out.println(value);
		} 
		
		
		//Tell them what they entered.
		//System.out.println("You xxxx: " + value);
	}

}
