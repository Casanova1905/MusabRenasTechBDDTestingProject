Feature: Guru69 Project

  Background:
    Given  user navigates to Guru99

  @Smoke
  Scenario: Verify the header contains expected text
    When Verify that the expected header contains "Mother Elephant With Babies Soft Toy"

  @Smoke
  Scenario: Verify that the price for toy is as expected
    Then Verify that the toy price is "Price: $20"

  @Smoke
  Scenario: Verify that the URL contains expected message
    Then Verify that the URL contains "payment-gateway"

  @Smoke
  Scenario: Verifying the quantity of item
    When User choose the quantity as "5"
    Then User click on Buy Now button
    When User input informations as below
    |CardNumber|1905190519941905|
    |ExpMonth  |02              |
    |ExpYear   |2025            |
    |CvvCode   |159             |
    Then User clicks on Pay button
    And User should be able to verify "Payment successfull!" text
