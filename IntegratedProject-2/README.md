\*\*Question 2:\*\*



You're working on a DevOps project where you need to set up a CI/CD pipeline. Your team has decided to use a Jenkins pipeline that builds a Java application inside a Docker container and automatically deploys it when changes are pushed to the Git repository.



Consider this scenario:



1\. Your Git repository has a `main` branch and a `develop` branch\

2\. You need to create a multi-stage Dockerfile that compiles the Java application in one stage and runs it in a minimal runtime environment in another stage\

3\. The Jenkins pipeline should trigger automatically when commits are pushed to either branch, but only deploy to production from `main`



\*\*Part A:\*\* Write a Dockerfile using multi-stage builds that:

\- Uses a base image with JDK for compilation

\- Copies only the compiled `.jar` file to a minimal JRE runtime image

\- Exposes port 8080



\*\*Part B:\*\* Explain which Git strategy (merge vs. rebase) you would recommend when integrating `develop` into `main`, and why it matters for the Jenkins build history.



\*\*Part C:\*\* What Jenkins configuration would you use to enable automatic builds with SCM polling, and how would you configure it to deploy only from the `main` branch?
