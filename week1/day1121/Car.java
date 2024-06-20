package week1.day1121;

public class Car {
	
	String brand = "Maruti";
	char first = 'B';
	int registration_number = 1213;
	boolean isOld = true;
	float capacity = 32.1f;
	long price = 110000111000L;
	double money = 17.99999999;
	short age = 10;
	
	public int getPrice() {
		return 900000;
	}
	
	public boolean isCarWashed() {
		return true;
	}
	
	private void driveYourSelf() {
		System.out.println("I am here");
	}
	
	/* Audi -> 1 -> White
	 * Ferrari -> 2 -> Grey
	 * Maruti -> 3 -> Red
	 * Maruti -> 4 -> Brown
	 */
	
	public String getColor(int whichCar) {
		
		if(whichCar == 1) {
		return "White";
	} else if (whichCar == 2)  {
	    return "Grey";
	} else if (whichCar == 2) {
		return "Red";
	}else {
		return "Brown";
	}
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.getPrice());
		System.out.println(myCar.isCarWashed());
	    System.out.println(myCar.getColor(2));
		myCar.driveYourSelf();
		
	}

}

/* 
Output

900000
true
Grey
I am here
*/