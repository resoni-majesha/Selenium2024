package week3.day3124;

public class Abmw extends ACarP {
	
	public void sunRoof() {
		
		System.out.println("I am coming from C - Sunroof");

	}

	public static void main(String[] args) {
		
		Abmw c = new Abmw();
		
		c.brake();
		c.horn();
		c.gear();
		c.sunRoof();
	}
}
