# User Stories

Create at least 5 user stories for your project to start out. Divide them amoungst all developers.

## What are User Stories?

User stories are a device commonly used in software development to identify what the functionality and design of a product should be by considering the interests and motivations of people with varied multiple points of view. They are presented in the manner of

> As a _____, I want _____, so that ___

This layout allows a client to communicate to a team what type of behavior they are looking for and allow the developer team to think up a solution that best fits the the clients need.

The development team will then create sub-bullets called ***Feature Tasks*** which are individual tasks that must be completed by the developer to accomplish the user story. Once all of the feature tasks for an individual user story is completed, so is the story. 

User stories can be described as: 

- Short, simple, and open for interpretation
- Presented to the developer (from the client) as the behavior they wish to see in their app. The user story should not present a solution.
- Should clearly communicate the end goal of the user
- Includes Acceptance Testing

## INVEST In Your User Stories
- **Independent**: The user story should be self-contained, in a way that there is no inherent dependency on another user story
- **Negotiable**: user stories, up until they are part of an iteration, can always be changed and rewritten
- **Valuable** to users or Customers: a user story must deliver value to the end user
- **Estimable**: You must always be able to estimate the size of a user story.
- **Small**: User stories should not be so big as to become impossible to plan/task/prioritize  with a certain level of certainty
- **Testable**: the user story or it's related description must provide the necessary information to make test development possible. 

## What Does It Look like?
- "As a \<role>, I want \<goal> so that \<benefit>" ("so that ..." is optional if no explanation is needed)
- As a user, I want to search for my customers by their first and last names so that I can quickly navigate to their accounts.
- As a non-administrative user, I want to modify my own schedules but not the schedules of other users.

## Example
- As an administrative user, I want the ability to modify all employee's schedules.

### Feature Tasks:
- Admin can choose which users schedules to view/edit
- Show the options for all employees schedules
- Select ability to have recurring schedules
- Save schedule changes

### Acceptance Tests:
- Ensure that the employee the admin picked links to the correct schedule
- Ensure the scheduling does not interfere with requested time off
- Ensure that the schedules successfully save into database
- Provide error message and abort transaction if system becomes unavailable


### Estimate your User Strories

Once your user stories have been completed. Estimate each of them on a scale of of "extra small" all the way to "extra large". This means take a look at each story and determine how long you expect the user story to take to be completed. 

You should anticipate an "extra small" user story to just take a 0-2 hours, while an "extra large" would take a day or two. Write your estimates on each user story, and keep track of your actual time once completed.