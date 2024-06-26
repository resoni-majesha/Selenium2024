package week6.day6121;

public class CreateLeadHooksNotes {

}

/*
* Feature: CreateLead functionality in LeafTaps application
* 
* Scenario: Create Lead with only mandatory fields
* 
* Given Open the Chrome browser
* And Load the application URL as "http://leaftaps.com/opentaps/control/main"
* And Enter username as <username>
* And Enter password as <password>
* When Click on login button
* Then Home page should be displayed
*
* Background that we created in the BLogin.feature is not applicable for another feature file
* Background of BLogin cannot be shared across different feature files
* Background:
* Given Open the Chrome browser
* And Load the application URL as "http://leaftaps.com/opentaps/control/main"
* 
* Disadvantage of Background: 
* It is applicable only to the scenarios in that specific feature file
* After scenario is not available
* If yu want to use Background to CreateLead feature file, yu should create new one 
* 
* In order to overcome the Background drawbacks, Cucumber has a feature called Hooks
* What is Hooks?
* It has 2 annotations
* 1. @Before
* 2. @After
* 
* We have multiple feature hooks
* Create a new class CreateLead in steps package
* As we have same steps in LeafTapsLogin class and CreateLead class, there is no need to create same implementation in both classes
* Create implementation for only the newly added steps
* When Click on crmsfa link
* And Click on Leads link
* 
* For other implemented steps it will use the implementation from LeafTapsLogin
* 
*/