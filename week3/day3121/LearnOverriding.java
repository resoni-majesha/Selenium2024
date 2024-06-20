package week3.day3121;

public class LearnOverriding {

}

/*
* Method Overriding
* It comes with inheritance concept
*                                              Vehicle
*                                              applyBrake() [1+2]
*                                              
*                        Car                                                 Auto
*                        
*          BMW                       Audi                                    Bajaj
*     absBrake() [1+2+3]
*     applyBrake() ->  Change it as applyBrake()
*
* applyBrake() method is common for all the Class
* absBrake is initially available for BMW, now it is available for all the cars
* Imagine, in applyBrake(), the logic is 1+2, but in absBrake(), the logic is 1+2+3 -> Logic varies
* Why we need to create separate function for absBrake(), we can also write it as applyBrake()
* i.e., function name is applybrake but the internal function/logic varies
* When an object is created for BMW, bmw. -> what it show? Bmw applyBrake or the superclass applyBrake?
* Inheritance has the ability to access their own function, super class function, super most class function
* Here overriding comes into picture, the super most class function is over rided in one of the subclass function
* i.e., Vehicle applyBrake() is overrided in BMW applyBrake() -> BMW overrides Vehicle class function
* So it will not show the supermost class function, it will only show the subclass(BMW) function
* When yu call bmw.applyBrake(), it will display the overrided function i.e., BMW applyBrake() function
* When the method signature is same for the dupermost class and the subclass, but the internal logic varies
* then it is called method overriding
* Overriding comes only in the inheritance class
* Example in Orvehicle, Orbmw, Orexe class
* Orbmw extends Orvehicle -> Both class has the same function applyBrake() -> Overrides week3.day121.Orvehicle.applyBrake
* Create object in exe class and write b.applyBrake(), it will show only BMW
* applyBrake() function is overridden in the subclass BMW
* Whenever we create object for the class, it will give the child class only
* Here, it has same function signature, but the logic is different
* Where overriding is implemented in Selenium?
* Go to any Selenium project -> Open ChromeDriver declaration -> Open ChromiumDriver declaration -> 
* Search SetFileDetector inside ChromiumDriver -> Implemented something there
* Open RemoteWebDriver declaration -> Search SetFileDetector -> 
* Overrides RemoteWebdriver SetFileDetector in  ChromiumDriver SetFileDetector 
* Here the Super most lass and the super class has same method namebut the logic differs
*/