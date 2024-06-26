Feature: Login functionality for leafTaps application

Scenario: Login with correct credentials

Given Open the Chrome browser
And Load the application URL as "http://leaftaps.com/opentaps/control/main"
And Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
Then Home page should be displayed 

Scenario: Login with incorrect credentials

Given Open the Chrome browser
And Load the application URL as "http://leaftaps.com/opentaps/control/main"
And Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
But Error message should be displayed 