Feature: Login functionality for leafTaps application

Background:
Given Open the Chrome browser
And Load the application URL as "http://leaftaps.com/opentaps/control/main"

Scenario Outline: Login with correct credentials

Given Enter username as <username>
And Enter password as <password>
When Click on login button
Then Home page should be displayed

Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'| 

Scenario: Login with incorrect credentials

Given Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
But Error message should be displayed