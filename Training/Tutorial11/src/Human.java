public class Human{

	private boolean alive = true;
	
	public void Die(){
		alive = false;
	}
	
	public boolean AreYouAlive(){
		return alive;
	}
}