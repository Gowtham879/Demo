Feature: Registor the E-commerce Application
  Scenario Outline: Registration with valid data in the E-commerce Application
    Given User is able to Launch the Application
    When User is Enter valid data is "<FirstName>" "<LastName>" "<Email>" "<PhoneNumber>"
    And  Enter Valid "<Password>" "<ConfirmPassword>"
    Then Verify User is able to Registor
    Examples:
      | FirstName | LastName | Email        |PhoneNumber| Password | ConfirmPassword | PhoneNumber|
      | Glean     | Maxwell  |RCB@gmail.com |6548902341 |ESCN@2023 |ESCN@2023        | 6548902341 |