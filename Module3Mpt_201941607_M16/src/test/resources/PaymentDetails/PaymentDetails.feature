#Author name: Manish Kumar
Feature: Payment Details page

Background: user is on Payment Details Page

Scenario: check the title
Given User is on Payment Details page
Then check the title of the page

Scenario: Failure in Payment Details on leaving the CardHolderName blank 
Given User is on Payment Details page
When user leaves CardHolderName blank and clicks the button
Then display alert msg

Scenario: Failure in Payment Details on leaving the DebitCardNo blank 
Given User is on Payment Details page
When user leaves DebitCardNo blank and clicks the button
Then display alert msg

Scenario: Failure in Payment Details on leaving the expirationMonth blank 
Given User is on Payment Details page
When user leaves expirationMonth blank and clicks the button
Then display alert msg

Scenario: Failure in Payment Details on leaving the expirationYr blank 
Given User is on Payment Details page
When user leaves expirationYr blank and clicks the button
Then display alert msg


Scenario: Successful Payment Details with all valid data
Given User is on Payment Details page
When user enters all valid data 
Then display alert with success 