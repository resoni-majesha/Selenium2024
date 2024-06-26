Feature: CreateLead functionality in LeafTaps application

Background:
Given Open the Chrome browser
And Load the application URL as "http://leaftaps.com/opentaps/control/main"

Scenario: Create Lead with only mandatory fields

Given Enter username as <username>
And Enter password as <password>
When Click on login button
Then Home page should be displayed
When Click on crmsfa link
And Click on Leads link