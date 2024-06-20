package week4.day4224;

public class AdvancedUserInteractions {

	public static void main(String[] args) {
		

	}

}

/*
* Advanced User Interactions
* Amazon - Scrolling down
* Mouse over, double click, right click - Automate
* Everything will be handled use action class
* What is AUI - To make direct interaction with the web element in order to access the complex user gestures
* Why?  To handle mouse and keyboard events during automation
* How? By instantiating the action class to access the methods of performing AUI
* Lot of methods are there, we can learn only the frequently used emthods
* To perform mouse events like mouse hover, drag, drop, scroll
* To work with keyboard events like control, shift, alt keys
* 
* How to handle?
* Action class is an APU which uses low level interface(Action) to give input in the web browsers
* Syntax: Actions act = new Actions(driver);
* WebDriver must be passed as an argument
* Actions -> org.openqa.selenium.interactions.Actions;
* Methods to handle mouse events
* 1. click() - click the curr co ordinates of the mouse pointer
* 2. click(WebElement) - Clicks the specified web element
* 3. clickAndHold() - Click and hold the 
* 4. clickAndHold(WebElement) - Click and hold the mouse button at the identified web element
* 5. contextClick() - to enable right click
* 6. contextClick(WebElement) - to enable
* 7. doubleClick() - helps to double click
* 8. doubleClick()
* 9. dragAndDrop()
* 10. moveToElement(WebElement Target)
* 11. moveToElement(WebElement Target, int x offset, int y offset) 
* 12. scrollToELement() - scrolls by provided till element
* 
* Methods to handle Keyboard actions
* 1. keyDown(charSequence key)
* 2. sendKeys(keysToSend)
* 3. keyUp(charSequence key) - performs the key release action
* 
*/