Feature: Application Login

@UatTest
Scenario: Home page default login
Given User in login page
When User login with "Austin" and password "Stone" 
Then  Home page will open
And   Cards displayed are "True"

@SysTest
Scenario: Home page default login
Given User in login page
When User login with "Brat" and password "Hart"
Then  Home page will open
And   Cards displayed are "False"

@RegTest
Scenario: Home page default login
Given User in login page
When User sign up with following details
| Drithi | Lu |	vmj00@discover.com | UnitedStates | 5854516519|
Then  Home page will open
And   Cards displayed are "False"

@RegTest
Scenario Outline: Home page default login
Given User in login page
When User login to application with <Username> and <Password>
Then  Home page will open
And  Cards displayed are "True"

Examples:
| Username | Password |
| Venu	   | Dri	  |
| Kane     | Drit	  |
| Renu	   | Drith	  |


