package assignment1;

abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	public void race()
	{
		System.out.println("Honda bike is racing");
	}

	
	void run() {
		
	}
	
}

public class AstractionDemo {

	public static void main(String[] args) {
		Honda h= new Honda();
		h.race();
		
	}

	}
