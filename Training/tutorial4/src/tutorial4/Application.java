package tutorial4;

public class Application {
	public static void main(String[] args) {
		int value = 6;

		boolean loop = value < 10;

		// System.out.println(loop);

		while (value < 10) {
			value = value + 1;
			System.out.println("Hello " + value);

		}

		/////////////////////////////////////

		int icecreams = 15;

		while (icecreams < 20) {
			System.out.println("Bobby" + icecreams);
			icecreams = icecreams + 2;
		}

	}
}
