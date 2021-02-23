Feature: Registering into the one cool summer
Scenario: Performing the user registration
Given User in the registration form
When User enters required data
| Fields         | Values          |
| FirstName      | Laxman          |
| LastName       | Baskaran        |
| phone          | 8778016326      |
| email          | laxman@gmail.com|
| Address        | mark Street     |
| City           | albany          |
| State          | Melbourne       |
| pin            | 12104           |
| country        | AUSTRALIA       |
| userName       | Laxman21        |
| password       | Laxman@123      |
|confirmPassword | Laxman@123      |
Then Registration should be success