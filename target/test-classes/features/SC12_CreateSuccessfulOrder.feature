@regression

Feature: create successful order
Registered user can create successful order
 
 Scenario: create successful order
 
 When navigate to HomePage
 And search for product in search box
 And  user add product to cart 
 And user navigate to shopping cart page
 And user can click on checkout
 Then user can order product successfully
