@regression

Feature: Select different tag
Registered user can select different tag
 
 Scenario: Select different tag


When navigate to HomePage
And user hover category and select subcategory
And user can select different tag
Then selected tag is displayed