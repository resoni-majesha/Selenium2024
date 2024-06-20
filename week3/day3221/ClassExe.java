package week3.day3221;

public class ClassExe {

	public static void main(String[] args) {
		
		Milton m = new Milton();
		m.stopSmoke();
		m.scold();
		m.moreAffection();
		
		// Scope Restriction
		
		Mother mo = new Milton();
		mo.moreAffection();
		mo.stopSmoke();

	}

}

/*
* If yu want to show only the mother class function to the ClassExe class
* Mother is the interface, we cannot create object for the interface
* But yu can create object for the one of the implementation class
* Mother mo = new Milton(); -> This shows only the mother implementation
*/