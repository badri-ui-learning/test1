Feature: fblogin

Scenario Outline: Login
	Given Browser is invoked
	When the user navigates to login page
	And enters "<username>" username
	And enters "<password>" password
	And clicks on login button
	Then Login "<loginstatus>" suceed
	
	
Examples:
|username|password|loginstatus|
|badri|automation|should|
|selenium|password|shouldnot|
|badri|password|shouldnot|
|selenium|automation|shouldnot|