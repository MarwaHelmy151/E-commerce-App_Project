@regression

Feature: Search product
Registered user can search for product
 
 Scenario: Search product
 
 Given navigate to HomePage
 When user enter the valid email and new password
 And search for product in search box
 Then product details appears
 
 