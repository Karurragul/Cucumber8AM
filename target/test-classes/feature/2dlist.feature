Feature: To Add customer in 2dlist
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given user should be in telecom homepage
    Given User click the add customer
    When User should provide valid details
      | ashok | kum     | abc@gmail.com  | chennai  | 12345678 |
      | bbbbb | kuma    | babc@gmail.com | chennai1 | 22222222 |
      | ccccc | kumar   | cabc@gmail.com | chennai2 | 33333333 |
      | ddddd | kumaran | dabc@gmail.com | chennai3 | 44444444 |
      | eeeee | raj     | eabc@gmail.com | chennai4 | 55555555 |
      | fffff | ram     | fabc@gmail.com | chennai5 | 66666666 |
    Then Customer id is generated
