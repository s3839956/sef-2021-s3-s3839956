2.1
In the V-model the unit testing is executed in the validation phase, however, the designing of the unit testing is done during the module design phase.

2.2
They are not the same concept. Validation is a mechanism designed to test the way the program runs and if it meets requirements where as verification is the process of checking documents, design code and program.

2.3
"As a Platform Administrator, I want to be able to list any dataset added as Private, so that only I can access it."

Given that I am a platform administrator
and I am logged in as an Admin
When I navigate to the list of datasets
I should be able to list them as private
Then only I should be able to view the dataset

Given that I am a platform administrator
and I am not logged 
When I try to navigate to the list of datasets
Then I should be redirected to the login page

Given that I am not a platform administrator
When I try to look for the link that takes an admin to the list of dataset
Then I should not be able to see an option to view datasets.


2.4
"As a Data Publishing User, I want to see my CSV file online, so that I can preview how it will be seen."

Given that I am a publishing user 
and I am logged in as such
When I locate my CSV file 
I should be able to open it online
Then I can preview how it will be seen 

Given that I am a publishing user
and I am not logged in 
When I try to find the option to view CSV file
Then I shouldn't be able to find the option

Given that I am not a publishing user
When I try to find the option to view CSV file
Then I shouldn't be able to find the option