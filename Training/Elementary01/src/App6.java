class Mathematica {
	int power(int base, int n){
		int i, p;
		
		p = 1;
		for (i = 1; i <= n; i++)
			 p = p * base;
		return p;
	}
}

public class App6 {

	public static void main() {

		Mathematica counting = new Mathematica(); 
		int i;
		for (i = 0; i < 10; i++)
			System.out.printf("Power: %d %6d %6d\n", i, counting.power(2,i), counting.power(-3,i));
		
		//return
		int result = counting.power(2,3);
		System.out.println("Result " + result);
		
	}

}
