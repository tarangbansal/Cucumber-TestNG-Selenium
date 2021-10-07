Feature: Add new item to ToDO list

  @nobrowser @single
  Scenario Outline: Single test
    Given user is on home Page with <browser>,<version>,<os> and <resolution>
    When select First Item
    Then select second item
    Then add new item
    Then verify added item
    Then Update the result
    Then Close the browser

    Examples:
      | browser  | version  |  os   |  resolution  |
      | chrome   | 87.0     | WIN10 |  1024x768    |


  @nobrowser @parallel
  Scenario Outline: Parallel test
    Given user is on home Page with <browser>,<version>,<os> and <resolution>
    When select First Item
    Then select second item
    Then add new item
    Then verify added item
    Then Update the result
    Then Close the browser

    Examples:
      | browser  | version  |  os   |  resolution  |
      | chrome   | 93.0     | WIN10 |  1024x768    |
      | firefox  | 87.0     | WIN10 |  1024x768    |