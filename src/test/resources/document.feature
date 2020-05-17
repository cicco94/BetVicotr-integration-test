Feature: "DocumentController" is an endpoint which exposes some CRUD operations

  Scenario Outline: delete a document
    Given I have a "<collectionName>", an "<id>"
    When I delete a document create with those attributes
    Then I should receive a success confirm json
    Examples:
      | collectionName | id |
      | c1             | 1  |
      | c1             | 2  |
      | c1             | 3  |

  Scenario Outline: insert a document
    Given I have a "<collectionName>", an "<id>" and a "<content>"
    When I insert a document create with those attributes
    Then I should receive a success confirm json
    Examples:
      | collectionName | id | content  |
      | c1             | 1  | content1 |
      | c1             | 2  | content2 |
      | c1             | 3  | content3 |

  Scenario Outline: get a document
    Given I have a "<collectionName>", an "<id>"
    When I get a document create with those attributes
    Then I should receive a success confirm json
    Examples:
      | collectionName | id |
      | c1             | 1  |
      | c1             | 2  |
      | c1             | 3  |

  Scenario Outline: update a document
    Given I have a "<collectionName>", an "<id>" and a "<content>"
    When I update a document create with those attributes
    Then I should receive a success confirm json
    Examples:
      | collectionName | id | content  |
      | c1             | 1  | content1 |
      | c1             | 2  | content2 |
      | c1             | 3  | content3 |



