Feature: Forms

@ValidCredentials
  Scenario: Move the switch to the OFF position

          Given User is on Forms page
          When User click switch button
          Then User should see message "Click to turn the switch OFF"


          Scenario: Check text after click "Active" button

          Given User is on Forms page
          When  User click Active button
          Then  User should see a text box "This button is active"
