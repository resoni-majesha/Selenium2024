Feature: Login functionality for leafTaps application

Scenario: Login with correct credentials

Given Open the Chrome browser
And Load the application URL
And Enter username as DemoSalesManager
And Enter password as crmsfa
When Click on login button
Then Home page should be displayed 
