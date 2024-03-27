Feature: user

    Scenario: Add user
        * def reqBody =
        """
        [
          {
           "id":120,
           "username":"epapa1",
           "firstName":"eva1",
           "lastName":"eva2",
           "email":"email16@gmail.com",
           "password":"90012",
           "phone":"628999012",
           "userStatus":1
           }
         ]
        """
        When url "https://petstore.swagger.io/v2/user/createWithArray"
        When method post
        And request reqBody
        Then print response
        And status 200

    Scenario: Get user
        When url "https://petstore.swagger.io/v2/user/nanda67"
        When method get
        Then print response
        And status 200

    Scenario: update user
        * def reqBody =
    """
    {
    "id":120,
    "username":"epapa2",
    "firstName":"eva3",
    "lastName":"eva4",
    "email":"email16@gmail.com",
    "password":"90012",
    "phone":"628999012",
    "userStatus":1
    }
    """

        When url "https://petstore.swagger.io/v2/user/nanda2"
        When method put
        And request reqBody
        Then print request
        And status 200

    Scenario: delete user
        When url "https://petstore.swagger.io/v2/user/nanda6"
        When method delete
        Then print response
        And status 200

    Scenario: login user
        When url "https://petstore.swagger.io/v2/user/login?username=nanda67&password=90012"
        When method get
        Then print response
        And status 200

    Scenario: logout user
        When url "https://petstore.swagger.io/v2/user/logout"
        When method get
        Then print response
        And status 200