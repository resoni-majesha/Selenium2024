package week3.day3221;

public class Milton implements Mother, Wife {

	@Override
	public void stopSmoke() {
		
		System.out.println("Acting....");
	}

	@Override
	public void moreAffection() {
		
		System.out.println("True");
	}

	@Override
	public void scold() {
		
		System.out.println("Double True");
	}

}

/*
* For multiple Inheritance we can write like Mother, Wife
* Here stopSmoke method will be added once, as it is common for both Mother, Wife
* If yu want to access anything from the class we need to create object for the class
*
*/