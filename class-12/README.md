# Class 12: Spring and RESTful Routing

## Resources
* [The Spring Initializr \[sic\]](https://start.spring.io/)
* [Spring Guides: Serving Web Content](https://spring.io/guides/gs/serving-web-content/)
* [Spring Static Resources](https://spring.io/blog/2013/12/19/serving-static-web-content-with-spring-boot)

## Agenda
- Announcements
    - Make sure you're sitting next to someone new!
    - CCW1 on Friday at 9am in Turing
        - CCW 2 is Sept 13, CCW 3 is Sept 27 (a shift from what I announced on Day 1)
- Code review
    - Stacks using two queues
    - Spring apps
- Daily Systems: stdout, stderr, /dev/null
- Lecture
    - MVC
    - Adding Models to our MVC
        - Defining a class & using it to render a template
        - Adding dependencies
        - Using the `application.properties` file
        - Defining repository interface
        - Using repository interface in the controller
- Lab intro

## Warmup Question
Fill in this table of RESTful routes for a `BlogPost` resource. The first row is done for you.

|Name of function | English description | HTTP method | Path | C/R/U/D?|
|-----------------|---------------------|-------------|------|---------|
|index            | get all blog posts  | GET         | `/blogposts` | R|
|                 | get one blog post   | | | |
|                 | add a new blog post | | | |
|                 | update a blog post  | | | |
|                 | delete a blog post  | | | |
