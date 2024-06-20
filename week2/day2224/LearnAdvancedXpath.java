package week2.day2224;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvancedXpath {

	public static void main(String[] args) {
		


	}

}

/*
 * Based on relationship
 * Not able to locate using basic xpath
 * -----------------Missing
 * 
 * Leaftaps username - div, h2, form, p
 * div & form - Parent to child
 * Form & p - Parent to child
 * All p tags - siblings
 * p tag sub tags - cousins
 * div & p tag - Grandparent to grandchild
 * 
 * Advanced Xpath
 * 1. Parent to child xpath
 * <form> to <p> = Testleaf username
 * Syntax: (parent relative xpath)/(tagName of child)
 * eg: //form[@id='login']/p
 * Amazon: Search bar - //div[@class='nav-search-field ']/input
 * Lestleaf: Username - //p[@class='top']/input
 * 
 * 2. Grandparent to Grandchild
 * <form> to <grandchild> 
 * Syntax: Grandparent relative xpath//tagName of grandchild
 * Salesforce: Username - //div[@id='usernamegroup']//input - It has 2 matches. We use index
 * Selenium will go for first match. So there is no need to write the index
 * Amazon: Search bar - //form[@id='nav-search-bar-form']//input
 * 
 * 3. Child to Parent
 * <p> to <form>
 * Syntax: Child Relative Xpath/parent::tagName of parent
 * Salesforce Username : //div[@id='username_container']/parent::div
 * Snapdeal search  - //input[@id='inputValEnter']/parent::div
 * 
 * 4. Grandchild to Grandparent 
 * <label> to <form>
 * Syntax: Grandchild relative xpath/ancestor::tagName of grandparent
 * Snapdeal: Help Center - //a[text()='Help Center']/ancestor::span
 * 
 * First 4 is important
 * 
 * 5. Elder Sibling to Younger Sibling
 * <label>(child) to <label>(child) of same parent
 * Syntax: (Elder Sibling relative xpath)/following-sibling::tagName of the younger
 * Ruto Xpath
 * 
 * 6. Younger Sibling to Elder Sibling
 * Syntax: Younger Sibling relative xpath/preceding-sibling::tagName of the Elder sibling
 * Leaftaps - Username(Axes Source) to usernametextbox (Axes Target) - In Ruto
 * 
 * 7. Elder cousin to Younger cousin
 * Syntax: Elder cousin relative xpath/following::tagName of the younger cousin
 * LeafTaps - Username to password
 * 
 * 8. Younger Cousin to Elder Cousin
 * Syntax: Younger cousin xpath/preceding::tagName of elder cousin
 * Leaftaps - Password to Username
 * 
 * Syntax:
 * Parent to Child
 * Basic Xpath parent / tagname of child
 * Ex: //div[@class='nav-search-field ']/input
 * 
 * GrandParent to GrandChild:
 * Basic Xpath for Gp//tagname of Gc
 * ex: //div[@id='usernamegroup']//input
 * 
 * Child to Parent:
 * Basic Xpath Child/parent::tagname of parent
 * EX: //div[@id='username_container']/parent::div
 * 
 * GrandChild to GrandParent :
 * Basic xpath for GC/::ancestortagname of GP
 * ex: //a[text()='Help Center']/ancestor::span
 * 
 * 
 * 1 missing
 */