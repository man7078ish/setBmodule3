#Author name:Manish Kumar
Feature: ConferenceRegistration Page

Background: user is on ConferenceRegistration Page

Scenario: check the title
Given User is on ConferenceRegistration Page
Then check the title of the page

Scenario: Failure in ConferenceRegistration  on leaving the first Name empty 
Given User is on ConferenceRegistration Page
When user leaves first Name blank
And clicks the button
Then display alert msg

Scenario: Failure in ConferenceRegistration on leaving the last Name blank
Given User is on ConferenceRegistration Page
When user leaves last Name blank and clicks the button
Then display alert msg

Scenario: Failure in ConferenceRegistration on incorrect email format 
Given User is on ConferenceRegistration Page
When user enters all data
But user enters incorrect email format and clicks the button
Then display alert msg

Scenario: Failure in ConferenceRegistration on leaving the mobile no. blank 
Given User is on ConferenceRegistration Page
When user leaves MobileNo blank and clicks the button
Then display alert msg

Scenario: Failure in ConferenceRegistration on incorrect mobileNo format 
Given User is on ConferenceRegistration Page
When user enters incorrect mobileNo format and clicks the button
|7722005480|
|0900000000|
|2345678989|
|84321|
|77722005480|
| |
Then display alert msg


Scenario Outline: Failure in ConferenceRegistration on leaving the people attending blank
Given User is on ConferenceRegistration Page
When user leaves people attending blank
Then display alert msg


Scenario: Failure in ConferenceRegistration on leaving the Building Name & Room No blank 
Given User is on ConferenceRegistration page
When user leaves Building Name & Room No blank and clicks the button
Then display alert msg

Scenario: Failure in ConferenceRegistration on leaving the Area Name blank 
Given User is on ConferenceRegistration page
When user leaves Area Name blank and clicks the button
Then display alert msg


Scenario: Failure in ConferenceRegistration on not selecting the city 
Given User is on ConferenceRegistration page
When user doesnot select city
Then display alert msg

Scenario: Failure in ConferenceRegistration on not selecting the state 
Given User is on ConferenceRegistration page
When user doesnot select state
Then display alert msg



Scenario: Failure in ConferenceRegistration on leaving the Conference full-Access blank 
Given User is on ConferenceRegistration page
When user leaves Conference full-Access blank and clicks the button
Then display alert msg



Scenario: Successful ConferenceRegistration with all valid data
Given User is on ConferenceRegistration page
When user enters all valid data 
Then navigate to Payment Details page 