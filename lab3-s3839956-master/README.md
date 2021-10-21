# Software Engineering Fundamentals - Lab #3: Unit & Acceptance Testing

This assessment is part of the individual assessments of the course.


<br />


## Introduction

This assessment evaluates the following CLOs:

- CLO 1: Explain and apply the main aspects of software engineering.
- CLO 2: evaluate requirements for a software system
- CLO 6: recognise and describe current trends in the area of software engineering
- CLO 7: Design and carry out tests using various testing techniques and tools.

The following topics are assessed:
- Unit Testing
- Acceptance Testing


<br /><br />


## Notes & Guidelines

In this assessment you will need to implement the functionalities and verify you code using unit testing to ensure specifications are met. **IMPORTANT: Provided code may include bugs and incomplete that you need to detect and fix**.

This is TDD (Test Driven Development). You write your code first, and then code _enough_ to make the test pass, and _nothing more_.


<br />

### Naming Convention
Use the following naming convention for your tests:

```
MethodName_ExpectedBehavior_StateUnderTest
```

For example:
```
isValid_False_IfMandatoryFieldsMissing
calculateBonus_ThrowsException_IfNotValidEmployee
```


<br />

### Warning: No Dummy Tests
The use of "dummy tests" is _not_ allowed. If you have dummy tests or dummy returns in your classes you will _fail_ the assignment.

**What is a dummmy test?**

This test will always pass, regardless of the content of the classes (model). In short words, a dummy test _tests nothing_! Any type of dummy test is forbidden and will make you fail the assignment.

```
// This is a dummy test in java
public void isValid_False_IfMandatoryFieldsMissing() {
    assertTrue(true);
}
```




<br />

**What are dummy returns?**

This refers to hard-coding a return in a class and you only test that very same return. This way, the test will always pass, but tests nothing!






<br /><br />

## Case: ProjectTeamCanAddMemberTest

The Company is developing a software tool to manage employees and projects developed within the company.  You are part of the scrum team developing the solution.

<br />

**Activity 1**

- The folders 'java/model' and 'java/utils' have some classes with default/fixed returns. You need to complete these classes. _You are required to ONLY complete those that are directly linked to the test you need to do_. **Note:** The quality of the code you put here will influence your marking. Refer to the Rubric.

- There is a class in 'test/java/*'. You need to fill the tests according to the following instructions. **Note:** name the tests using the _naming convention_ defined above. 

_What to implement?_

1.1 Implement and test `Project.canAddTeamMember(Employee)`that respects the following:

- `Employee.getNumberOfProjects()` must return the correct number after the operation
- `Project.getTeam()` should return a number that is usable.
- Throws an `IllegalTeamMemberException` if an `Employee` is already part of team.
- A team can only have up to 6 team members, without duplicates.
- An `Employee` should not be part of more than 3 teams.


NOTE:

- The `Project.canAddTeamMember(Employee)` verifies that the constraints to add a new member. 

- Each test criteria must be in an independent test method and named as specified in the README.

- Initialize the test object with setUp method. You are expected to use a proper unit testing initialisation.


<br />



**Activity 2**

In the `ACCEPTANCE.md` file that is already created, you need to complete the following tasks:

2.1. In the V-Model, the unit test is performed in which phase? Justify your answer. _You cannot write more than 50 words_.

2.2. Are verification and validation the same concept? This is to say: are they synonyms?. Justify your answer. _You cannot write more than 50 words_.

2.3. Write GWT acceptance testing for the following user story. Paste the story in the answer file as well. This system is to share and manage datasets. _This must account for thorough testing, and evaluate alternative paths. Your testing must be detailed_. You will need to make some assumptions on the system, you can write that in the `ACCEPTANCE.md` file. _"As a Platform Administrator, I want to be able to list any dataset added as Private, so that only I can access it."_

2.4. Write GWT acceptance testing for the following user story. Paste the story in the answer file as well. This system is to share and manage datasets.  _This must account for thorough testing, and evaluate alternative paths. Your testing must be detailed_. You will need to make some assumptions on the system, you can write that in the `ACCEPTANCE.md` file. _"As a Data Publishing User, I want to see my CSV file online, so that I can preview how it will be seen."_






<br />

## Rubric

Check Canvas to see the rubric for this assignment.

