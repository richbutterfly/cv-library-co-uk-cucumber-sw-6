Feature: Job search test
  As a user, i want to test different options for jon search

  Scenario Outline: verify Job Search Result Using Different DataSet
    Given I am on Homepage
    When  I accept all cookies
    And I enter title of job "<Job title>"
    And I enter location "<Location>"
    And I select distance "<Distance>"
    And I click on More Search option link
    And I enter minimum salary "<Salary Min>"
    And I select maximum salary "<Salary Max>"
    And I select salary type "<Salary type>"
    And I select job type "<Job type>"
    And I click on Find Jobs Button
    Then I should see the message in result "<Result>"

    Examples:
      | Job title              | Location           | Distance | Salary Min | Salary Max | Salary type | Job type       | Result                                                    |
      | Tester                 | Harrow on the Hill | 5 miles  | 30000      | 500000     | Per annum   | Permanent      | Permanent Tester jobs in Harrow on the Hill               |
      | Tester                 | Wembley            | 10 miles | 50000      | 500000     | Per annum   | Apprenticeship | Apprenticeship Tester jobs in Wembley                     |
      | Python                 | Birmingham         | 10 miles | 2000       | 4500       | Per month   | Contract       | Contract Python jobs in Birmingham                     |
      | Qa Test Analyst        | Tottenham          | 7 miles  | 70000      | 500000     | Per annum   | Permanent      | Permanent Qa Test Analyst jobs in Tottenham               |
      | Software Tester        | Leiscester         | 10 miles | 30000      | 500000     | Per annum   | Permanent      | Permanent Software Tester jobs in Leicester               |
      | Software Test Engineer | King's Cross       | 5 miles  | 50000      | 500000     | Per annum   | Permanent      | Permanent Software Test Engineer jobs in King's Cross     |
      | Software Team Leader   | Harrow on the Hill | 10 miles | 100000     | 1000000    | Per annum   | Permanent      | Permanent Software Team Leader jobs in Harrow on the Hill |