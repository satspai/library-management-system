Feature: Post return book to library

  Scenario: Member returns a borrowed book
    Given a book with ID "B001" is issued to member "M001"
    When the member with ID "M001" returns book with ID "B001"
    Then the book status should be "AVAILABLE"
    And the book should not be assigned to any member