
public class App7 {

	public static void main(String[] args) {
		final int lower = 0;
		final int upper = 100;
		final int step = 1;
		System.out.println("Scores:");
		for (int data = upper; data >= lower; data = data - step) {
			System.out.printf("%3d\n", data);
		}
	}

}
