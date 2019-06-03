Feature: Add customer
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given User is in telecom homepage
    And user click the add customer
    When User enter valid detail
      | fnam   | Ragul         |
      | lnam   | kumar         |
      | mail   | abc@gmail.com |
      | add    | madras        |
      | mobile |       9999999 |
    Then I validate the outcomes
