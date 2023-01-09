@regression

Feature: Add differnet products to Cart
Registered user can add differnet products to Cart
 
 Scenario: Add differnet products to Cart
 
 When navigate to HomePage
 And search for product in search box
 And  user add product to cart 
 And user navigate to shopping cart page
 And user can continue shopping
 Then user can add different products
  
  