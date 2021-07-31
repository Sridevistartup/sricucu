Feature: Basic for report practice
Scenario: Facebook login
Given when user enter username "merla" and password "devi"
When click on submit
Then error displays
Scenario: Facebook login
Given when user enter username "merla" and password "devi"
When click on submit
Then error displays
Scenario Outline: Facebook login
Given when user enter username "merla" and password "devi"
When click on submit
Then error displays
Examples:
|user|pwd|
|sridevi|sri|
|devi|sree|