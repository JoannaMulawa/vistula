
public class App4 {

	public static void main() {

		final int upper = 0;
		final int lower = 300;
		final int step = 20;
		int fahr;
		for (fahr = lower; fahr >= upper; fahr = fahr - step) {
			System.out.printf("%3d %6.1f\n", fahr, (5.0 / 9.0) * (fahr - 32));
		}
	}

}
