
public class App2 {

	public static void main() {
		/* write summary temperature Fahranheit-Celscjus  
		 for f = 0,20,..., 300 */
		
		int fahr; 
		double celsius;
		int lower, upper, step;
		
		lower = 0;   /* lower border temp */
		upper = 300;  /*upper border */
		step = 20; /* size of the step */
		fahr = lower;
		
		while (fahr <= upper) {
			celsius = 5.0 * (fahr - 32.0)/9.0;
			System.out.printf("%3d\t%6.1f\n", fahr, celsius);
			fahr = fahr + step;
			
		}
		
		int i;
		int j;
		i = 2;
		j = 15;
		while (i < j) {
			i = 2 * i;
			//System.out.println(i);
		}
	}

}
