import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "pupa":
			System.out.println("Wypiela pupe!");
			break;

		case "stop":
			System.out.println("Machine stopped.");
			break;
		default:
			System.out.println("Whatever,foch!");

		}
	}

}
