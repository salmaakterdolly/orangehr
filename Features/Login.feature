@Login
Feature: As a user 
i want to log in to the site
so that i can see the details of the page
Scenario Outline: user can able to login to the page successfully
Given as a user i am on registration page
When i enter "<user name>" "<password>" "<login>"
And i click on dashboard
And i click on leavelist
And i click on admin
And i click on user managment
And i click on user
And i click on search 
Then i see the user leave list

Examples:
    |user name|password|
    |Admin    |admin123|