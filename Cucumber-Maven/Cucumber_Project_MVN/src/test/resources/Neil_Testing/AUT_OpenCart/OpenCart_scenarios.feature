Feature: OpenCart Functionality testing scenarios

  Scenario Outline: Login Functionality of AUT
  Given User Navigate to AUT
  When Click on MyAccount to "register"
  Then User enter details "<FirstName>","<LastName>","<EmailID>","<PhoneNum>"
  Then User enter "<password>" details
    Then User Clicks on MyAccount to "Logout"

    Examples:
      | FirstName | LastName |EmailID|PhoneNum|
      |Test|Neil| neilTest@gmail.com|62183232|