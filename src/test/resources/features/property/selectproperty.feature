Feature: User can select a property

  @property
  Scenario: User can select a property
    Given the User is logged into the system administrator as username and realpage as password
    When the User navigates through the menu to property list
    And clicks on a property
    Then User can see the property profile
