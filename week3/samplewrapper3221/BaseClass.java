package week3.samplewrapper3221;

public class BaseClass implements Wrapper {

	@Override
	public void launchApp(String browser, String url) {
		
		
	}

	@Override
	public void locateElement(String loc, String locVal) {
		
		
	}

}

/*
* BaseClass throws error saying add unimplemented methods
* When yu click on add unimplemented method, the method yu created in wrapper class will be added here automatically
* It will help to avoid the usage of duplicate methods. i.e., all person will use the same method name with the help of interface
*
* @Override denotes that this function must be overridden function, it must be implemented in the supermost class
* 
* Below is the structure hereafter
* 
*                                                    Interface
*                                                    
*                                                  SeleniumMethod 
*                                                  
*                     TC001CreateLead              TC001EditLead               TC001DeleteLead           
*                                                    
* Yu need to create the interface first, based on the interface yu need to create the superclass
* Based on the Selenium method write your testcases
* 
* SeleniumMethod implements Interface
* TC001CreateLead extends SeleniumMethod
* TC001EditLead extends SeleniumMethod
* TC001DeleteLead extends SeleniumMethod
*/