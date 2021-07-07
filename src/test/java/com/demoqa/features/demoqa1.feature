Feature: Registration_Alert_MouseHover
  As a student
  i want to fill practice form
  So i can register myself

  @Registration
  Scenario: Registration with mandatory field
    Given i am on homepage
    When i entered  first name and last name
    And i enter email address
    And i click on gender male
    And i enter my mobile number, birthdate and subject
    And i click on my hobby and upload my image
    And i enter my address
    And select state and city
    And i click on submit button
    Then i can see registration conformation with all details

