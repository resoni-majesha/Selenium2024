package week3.day3121;

public class LearnOopsInheritance {

	public static void main(String[] args) {
		

	}

}

/*
* Inheritance
* 
* There are 2 classes. 
* 1. ClassA with 2 methods - m1, m2
* 2. ClassB with
* 
* If yu want to access one ClassA functions to another class ClassB, we need to create the object. 
* Based on the object we can access the functions of the another class
* This is one way
* 
* There are multiple ways we can achieve this
* 1. Using Object
* 2. Inheritance
* 3. Using Static
* 4. Using Reflection
* 
* Inheritance - One of the most important OOPS pillar
* One of the mechanism to access properties of one class to the other class
* Consider ClassA as Parent & ClassB as Child
* Once Parent and Child is declared, 
* Using some keyword we can easily access one class function to the other class without creating object
* 
* Consider Mr.Bean example
* 
* 1. Mr.Bean's Grandfather -> Grandfather / Super / Base Class
* Has 2 properties -> One bungalow & one house
* Here GrandFather is one Java Class
* 
* 2. Mr.Bean's Father -> Sub / Derived Class
* Has one own house
* MyFather is another Java Class
* 
* Grandfather has 2 property & father has 1 property
* Assume MyFather is only one child for his GrandFather
* As per Indian law, Grandfather property comes to only one child
* Here, if we apply Inheritance concept, parent class property can be accessed
* 
* For implementing the Inheritance in Java, there is a keyword called 'extends'
* 
* MyFather extends My GrandFather 
* Now MyFather access his own properties & also the My GrandFather properties w/o using object
* 1 bungalow, 2 house
* 
* GF - Base Class      - Parent Class    - Super Class
* F  - Derived Class   - Child Class     - Sub Class
* 
* GF - 2 property
* F - 1 property
* 
* Now we achieve this using -> F extends GF - Child comes first - 3 properties
* How many level of Inheritance - One Child inherits the Parent - Single level of Inheritance
* 
* Now, Mr.Bean
* Has one property
* I extends FatherClass extends GrandFatherClass -> B extends F extends GF -> Multi level Inheritance - 4 properties
* Now Mr.Bean has his own property, his fathers's property and his grandfather's property
* Mr.Bean now has 3 house + 1 bungalow
*  
* In Java, at class level it supports Single level Inheritance (F extends GF), Multi Level Inheritance (B extends F extends GF)
* 
* c1        ->                  GrandFather   ------                               --------
*                               m1                 |                                      |
*                               m2                 |                                      |
*                               ^                  |     Single Level Inheritance         |
*                               | extends          |                                      |
* c2        ->                  Father             |                                      |
*                               m3            ------                                      | 
*                               ^                                                         |   Multilevel Inheritance
*                               | extends                                                 |     
* c3        ->                  GrandChild                                                | 
*                               m4                                                 --------
*                                                 
* Object for Father -> m3, m2, m1
* Object for Grandchild -> m4, m3, m2, m1
*                                                             
* Why is Inheritance mandatory in OOPS concept?
* 
* Inheritance another example:
*                                                                 Vehicle
*                                                                 applyBrake
*                                                                 soundHorn
*                                                                 changeGear
*                                                                 
*                            Car                                                                Auto
*                         applyBrake x Remove first 3                                           applyBrake  x Remove first 3   
* BMW extends Car         soundHorn            Audi extends Car                                 soundHorn   Bajaj extends Car
*                         changeGear                                                            changeGear  is not a correct one
*                                                                                                           Create a Auto Class
*                         fourWheels           Newly added                                      threeWheels
*                         turnOnAc                                                                     
*                                                                                               Bajaj extends Auto
*                            
*           BMW                               Audi                                              Bajaj
*       applyBrake    x Remove all 3        applyBrake   x Remove all 3 as it extends Car       applyBrake x Remove
*       soundHorn     x from BMW            soundHorn    x                                      soundHorn
*       changeGear    x and add to Car      changeGear   x                                      changeGear
*                          
* We have a BMW Class, Audi Car. Both of them have same action -> applyBrake, soundHorn, changeGear 
* Creating 2 class for similar actions is not the right way. It's not an optimized way to design a project
* Instead of this, create a new common class called Car
* Audi extends Car, BMW extends Car, now remove the functions from both the classes
* This is Single level Inheritance
*                         
* We have another class Bajaj - It is related to Auto
* Car has 4 wheels. So we add a function 'fourWheels' in Car class
* So if Bajaj extends Car, then it is not the current design     
* Add another function, turnOnAc which is not available in Auto
* So now, Bajaj extends Car inheritance is not a correct one   
* 
* Now, we add a new class Auto
* Auto has applyBrake, soundHorn, changeGear, threeWheels functions
* Bajaj extends Auto now -> Single level Inheritance
* 
* We used applyBrake, soundHorn, changeGear in each class, then we needed to avoid the duplicate
* We created a new Superclass Auto
* If we see both the Superclasses Car, Auto has the common function applyBrake, soundHorn, changeGear
* We need to avoid this duplicate also
* 
* So we create another Superclass named Vehicle
* Now, BMW extends Car extends Vehicle
* Audi extends Car extends Vehicle
* 
* Bajaj extends Auto Vehicle
* 
* Remove applyBrake, soundHorn, changeGear from Car, Auto and add it to vehicle class
* 
* This is the purpose of implementing inheritance concept 
* 
* Go to ExeClass for coding notes
* 
* Multiple Inheritance is not applicable under the class level - 2 parent & Single child is not possible
* 
* Where Inheritance is implemented in Selenium?
* If yu want to launch Chrome Browser, yu need to create object for the ChromeDriver class
* If yu want to launch Firefox Browser, yu need to create object for the FirefoxDriver class
* If yu want to launch Edge Browser, yu need to create object for the EdgeDriver class
* 
*                                                  RemoteWebDriver 
*                                                  .get()
*                                                  .findElement()
* 
*                   ChromiumDriver
*                   m1
*                   m2
* 
* ChromeDriver                       EdgeDriver                           Firefox                             SafariDriver
* .get() x Remove get,findEle        .get()                               .get()                              .get()
* .findElement() add in RemoWebDri   .findElement()                       .findElement()                      .findElement()
* m1() x Remove m1, m2               m1() x Remove m1, m2 
* m2() add in ChromiumDriver         m2()
* 
* Code for launching the browser will be different, but all the functions are common for all browsers -.get(), .findElement()
* Implement same functions in different class is not a good idea, so there will be some Super Class
* Imagine, there is m1(), m2() which is common for ChromeDriver & EdgeDriver
* They will create common SuperClass for both ChromeDriver & EdgeDriver named ChrominumDriver
* ChromeDriver driver = new ChromeDriver();
* To check the Inheritance of the ChromeDriver Class, go to any Selenium code. Right click on ChromeDriver -> Open Declaration
* There yu could see, ChromeDriver inherits ChromiumDriver
* Now Open Declaration for ChromiumDriver. Here ChromiumDriver extends RemoteWebDriver
* RemoteWebDriver - Supermost class for Selenium API
* So ChromeDriver extends ChromiumDriver
* ChromiumDriver extends RemoteWebDriver
* Firefox, Safari, IE, Opera extends RemoteWebDriver
* To see the hierarchy, right click Open Hierarchy - yu will find the Inheritance
* 
* To check whether get() is designed in Chromedriver
* Right click ChromeDriver, Open Declaration -> Press ctrl+O
* It will show all the methods, variables. There is no get() function inside ChromeDriver
* ChromeDriver only contains the constructors - ChromeDriver(),...
* 
* Open Declaration for ChromiumDriver -> Press ctrl+O -> It has lot of functions -> search get() - No get() function found
* Now open Declaration for RemoteWebDriver -> Press ctrl+O - Yu can find get() function
* They implemented all the common action that yu use in Selenium in the RemoteWebDriver Class
* 
* How can use Inheritance in our Project/ my current structure
* Launch browser, get the URl, maximizing the window are common in all program
* Yu have the scenario to choose the dropdown value in 15 testcase
* Each testcases has 15 to 20 steps. eg: 15*2 -> Totally 300 steps
* In 300 steps, nearly 15 places, we are writing the same code to choose the value from the dropdown
* Here dropdown vary, value of the dropdown vary. So we are writing the duplicate code. Hence we need to optimize it.
* So we need to create a common action for all the actions like 
* click(), enter the value in the textField, choose the value in the text field
* Once we develop the common action, we can use the methods to start write the code
* Create and convert the inheritance concept as reusable method and use in your code 
* 
* What we learned is level one
* Now we are moving to level 2 of learning
* 
* Level 1
* driver.findElement(By.id(""));
* 
* Level 2
* Create a package called wrappers. This is the starting point of framework
* 
* As it is connected to inheritance, it is introduced here
* TestNG is Level2
* 
* Go to wrappers package
*/