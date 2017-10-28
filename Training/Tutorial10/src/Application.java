
public class Application {

	public static void main(String[] args) {

		int value = 7;
		
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
	/*	System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);*/
		
	//	values[3] = 5;
		
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
			
		}
		
		String[] names = {"Cypus","Bianka" , "Samcio"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
				
	}

}
