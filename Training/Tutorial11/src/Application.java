
public class Application {

	public static void main(String[] args) {

		String[] words = new String[3];

		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
			
		}
		String text = null;
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println(texts[1]);
		
		Human robert = new Human();
		System.out.println(robert.AreYouAlive());
		robert.Die();
		System.out.println(robert.AreYouAlive());
	}

}






