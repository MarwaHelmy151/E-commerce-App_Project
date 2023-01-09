@regression

Feature: Change currencies
Registered user can change currencies
 
 Scenario: Change currencies
 
 Given navigate to HomePage
 When select another currency from DDL
 Then currency is changed successfully