#Author: poorna
#Keywords Summary : 
#Feature: Login
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: LoginPage Functionality



Scenario: Verify Login Functionality with Invalid credentials

Given Fitbit app is opened
When user enters "Poornachandrarao.948@gmail.com" and "test" and click on login button
Then verify if user is not logged into appliction


Scenario: Verify Login Functionality with valid credentials

Given Fitbit app is opened
When user enters "Poornachandrarao.948@gmail.com" and "test123456" and click on login button
Then verify if the user is logged into the fitbit app


