# CI/CD & Deployment Pipelines

## Agenda

- Announcements
- Code review
- Lecture
- Lab intro

### More Complete Pipelines

In production, there's more to continuous deployment and integration than simply connecting to github and running your code out. 

- Do your tests pass?
- Can your code build properly on the target system(s)
- Does your code run properly on the target system(s)
  - Why are these even a consideration?
- Does your code scale properly under load?

We need to add some more "phases" to our deployment process to make these assertions (and potentially others) and provide some measure of stability and sanity to getting our code "live"

### Multiple Environments

Thus far, we've just deployed to a single server instance, from a single source, either uploaded manually, or (now) hooked into master.

In production systems, this is not necessarily what we want. Going directly from dev to production is shortsighted and potentially unsafe.

**Larger code bases use multiple environments**

- Why?
- How?
