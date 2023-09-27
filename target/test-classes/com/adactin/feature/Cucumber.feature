#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
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
@tag
Feature: End to End scenarios for adactin Application


Scenario: Login to adactin Application
    Given User is on the adactin Application
    When User Enetr the User_Name in "AkshayaMohan" Field
    And User Enter Password in "mohanapk@11" Field
    Then User Enter Login Button to search Hotels
    

Scenario: Search Hotel on Adactin Application 
    When User Select the Location in location Field
    And User Select Hotel in hotel Field
    And User Select RoomType in Roomtype Field
    And User Enter No.of Rooms in RoomNos Field
    And User Enter Check_In Date in Checkin Field
    And User Enter Check_Out Date in checkout Field
    And User Enter Adults per Room details in respective Field
    And User Enter Childrens per Room details in respective Field  
    Then User Enter Search Button to Search Hotel