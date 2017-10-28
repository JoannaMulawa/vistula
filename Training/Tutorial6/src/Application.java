
public class Application {
	public static void main(String[] args) {
		
		int loopCounter = 0;
		
		while(loopCounter < 5){
			System.out.println("Looping:" + loopCounter);
			
			if(loopCounter == 3){
				System.out.println("Shit happend");
				break;
			}
			
			loopCounter++;
		}
				
		
		boolean condtion = 5 != 2;
		System.out.println(condtion);
		
		if(4 == 4){
			System.out.println("Yes, it's true");
		}
		
		int age = 35;
		if(age < 50){
			System.out.println("Bara bara");
		}
		else{
			System.out.println("No, it's false");
		}
						
		int weight = 79;
		
		if(weight < 60){
			System.out.println("Chuda dzida");
		}
		else if(weight < 70){
			System.out.println("Tłuściutka dzida");
		}
		else {
			System.out.println("Gruba dzida");
		}
	}
}
