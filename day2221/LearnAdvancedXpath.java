package week2.day2221;

public class LearnAdvancedXpath {

	public static void main(String[] args) {
		

	}

}

/*
 * Axes
 * 1. Parent to Child
 * 2. Grandparent to Child/Grandchild
 * 3. Child to Parent 
 * 4. GrandChild to GrandParent
 * 
 * 1. Parent to Child
 * Syntax: (Relative Xpath for Parent)/tagName of child
 * Leaftaps: Username - (//form[@id='login']/p)[1]
 * 
 * 2. Grandparent to Child/Grandchild
 * Syntax: (Relative Xpath for Grandparent)//tagName of Grandchild
 * (//form[@id='login']//label)[1]
 * (//form[@id='login']//label)[@for='username'] - Another method
 * (//form[@id='login']//label)[@for='password']
 * 
 * 3. Child to Parent
 * Syntax: (Relative Xpath for Child)/parent::tagName of parent
 * (Relative Xpath for Child)/.. - To go to the previous one(/..)
 * //input[@id='username']/parent::p
 * 
 * 4. GrandChild to GrandParent
 * Syntax: (Relative xpath for Grandchild)/ancestor::tagName of grandparent
 * Who are ancestors? - parent, grandparent, grand-grandparent
 * zoomcar: Tell us your starting point
 * (//input[@class='search'])/ancestor::div[4]
 * (//input[@class='search'])/ancestor::div[@class='locationFinder']
 * 
 * (//div[@class='search-input'])//div[@class='dropdown']
 * 
 * Cousins
 * Elder Sibling
 * Younger Sibling
 * Elder cousin
 * Younger cousin
 * 
 * 5. Elder Sibling to Younger Sibling
 * 6. Younger Sibling to Elder Sibling
 * 7. Elder cousin to Younger cousin
 * 8. Younger Cousin to Elder Cousin
 * 
*/
