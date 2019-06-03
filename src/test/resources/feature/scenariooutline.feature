Feature: To add customer

  Scenario Outline: Add customer
    I want to use this template for my feature file

    Given User is in telecom homepage
    And user click the add customer
    When User entered valid detail"<fname>","<lname>","<mail>","<address>","<mobile>"
    Then I validate the outcomes

    Examples: 
      | fname | lname | mail            | address | mobile    |
      | arvi  | kumar | abc@gmail.com   | chennai |   9999999 |
      | ravi  | kum   | qaz@gmail.com   | bglre   | 888888888 |
      | mani  | maran | werty@gmail.com | Mumbai  |   7777777 |
      | ashok | babu  | plmko@gmail.com | kochi   |  66666666 |
