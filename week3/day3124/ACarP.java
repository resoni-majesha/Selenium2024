package week3.day3124;

public class ACarP extends AvehicleGP {
	
	public void gear() {
		
		System.out.println("I am coming from P-gear");
	}

	public static void main(String[] args) {
		
		ACarP p = new ACarP();
		p.brake();
		p.horn();
		p.gear();
	}
	
}
