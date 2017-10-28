
public class App3 {

	public static void main() {
		/* write summary temperature Celsius -Fahranheit   
		 for c = 0,20,..., 300 */
		
		int celsius; 
		double fahr;
		int lower, upper, step;
		
		lower = 0;   /* lower border temp */
		upper = 300;  /*upper border */
		step = 20; /* size of the step */
		celsius = lower;

		
		System.out.printf("Celsius  Fahr\n");
		while (celsius <= upper) {
			fahr = (9.0/5.0) * celsius + 32;
			System.out.printf("%3d\t%6.1f\n", celsius, fahr);
			celsius = celsius + step;
			
		}
		
	}

}
