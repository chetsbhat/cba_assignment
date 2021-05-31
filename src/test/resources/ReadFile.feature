Feature:  parse the file q1.test_data
  @first
  Scenario: write as key value pairs in Excel and CSV file
    Given I Open Test file
    When I read test file
    Then I copy key value pairs in excel
    Then I close the excel file