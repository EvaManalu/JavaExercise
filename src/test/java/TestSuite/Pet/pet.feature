Feature:
  Background:
    Given url "https://petstore.swagger.io/v2/pet"
    And print "--Connect pestore API--"

  @scenario1
  Scenario: Add pet store
    * def reqBody =
  """
  {
  "id":11,
  "category":
  {
    "id":21,
    "name":"string"
  },
  "name":"doggie",
  "photoUrls":["string"],
  "tags":[
    {
      "id":13,
      "name":"string"
    }
  """
    When url "https://petstore.swagger.io/v2/pet"
    When method post
    And request reqBody
    Then print request
    And status 200

  Scenario: Get Pet
    When url "https://petstore.swagger.io/v2/pet/134342"
    When method get
    Then print response
    And status 200

  Scenario: Get pet nby Status
    When url "https://petstore.swagger.io/v2/pet/findByStatus"
    And params {status:available}
    When method get
    Then print response
    And status 200

  Scenario: Delete Pet
    When url "https://petstore.swagger.io/v2/pet/134342"
    When method del
    Then print response
    And status 200

  Scenario: Check Pet After Delete
    When url "https://petstore.swagger.io/v2/pet/134342"
    When method get
    Then print response
    And status 404

