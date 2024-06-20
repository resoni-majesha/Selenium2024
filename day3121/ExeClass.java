package week3.day3121;

public class ExeClass {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.applyBrake();
		v.soundHorn();
		
		Car c = new Car();
		c.turnOnAc();
		c.applyBrake();
		c.soundHorn();
		
		Bmw b = new Bmw();
		b.sDrive();
		b.turnOnAc();
		b.applyBrake(); // Car internally inherits Vehicle
		b.soundHorn();	

	}

}

/*
* This Class is created for execution purpose
* We can make this execution(main) in Car class if it is Single level Inheritance & in BMW class if it is multilevel inheritance
* 
* Create Vehicle class
* Create Car class
* Create Execution class - ExeClass
* Create Object for Vehicle and Car class in ExeClass
* Vehicle Class shows Vehicle functions v.applyBrake(), v.SounHorn()
* Car Class shows Car functions c.turnOnAc()
* O/p:
* Apply Brake
* Sound Horn
* 
* Now we need to apply the Inheritance concept 
* Go to Car Class and add extends keyword -> Car extends Vehicle
* When yu applied the inheritance concept using extends keyword 
* Now, Car class shows both Vehicle and Car class functions
* O/p:
* Apply Brake
* Sound Horn
* Turn on AC
* Apply Brake
* Sound Horn
* 
* If we write BMW extends Car, then BMW inherited Car, Car internally inherited Vehicle
* Now, BMW class will have applyBrake, soundHorn, turnOnAc, sDrive
* This is Multi level Inheritance
* 
* In ExeClass, right click on Bmw class, press Type Hierarchy. It will show the entire hierarchy
* By default in all the Java Class, even if yu dont apply the inheritance, it always internally inherits the Object class
* 
* Now only Vehicle and Car class is created. We need to create one more BMW class, thats why we created ExeClass for execution
* Otherwise we can make the execution in Car class itself
* If we create BMW class, we can make the execution in BMW class itself
*/