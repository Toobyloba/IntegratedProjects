\*\*Question 2:\*\*



You're working on a DevOps project where you need to set up a CI/CD pipeline. Your team has decided to use a Jenkins pipeline that builds a Java application inside a Docker container and automatically deploys it when changes are pushed to the Git repository.\[1]\[2]\[3]



Consider this scenario:



1\. Your Git repository has a `main` branch and a `develop` branch\[1]

2\. You need to create a multi-stage Dockerfile that compiles the Java application in one stage and runs it in a minimal runtime environment in another stage\[3]

3\. The Jenkins pipeline should trigger automatically when commits are pushed to either branch, but only deploy to production from `main`\[2]



\*\*Part A:\*\* Write a Dockerfile using multi-stage builds that:

\- Uses a base image with JDK for compilation

\- Copies only the compiled `.jar` file to a minimal JRE runtime image

\- Exposes port 8080\[3]



\*\*Part B:\*\* Explain which Git strategy (merge vs. rebase) you would recommend when integrating `develop` into `main`, and why it matters for the Jenkins build history.\[2]\[1]



\*\*Part C:\*\* What Jenkins configuration would you use to enable automatic builds with SCM polling, and how would you configure it to deploy only from the `main` branch?\[2]



\[1](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/collection\_ef002705-2ffe-4f29-9ea8-bb21ab273fdc/5e1bc471-9285-404e-a89e-94d5ad17cc29/GIT.txt)

\[2](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/collection\_ef002705-2ffe-4f29-9ea8-bb21ab273fdc/5cbcd9e5-0e52-439a-8f54-9a4bd98a973c/JENKINS.txt)

\[3](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/collection\_ef002705-2ffe-4f29-9ea8-bb21ab273fdc/8255cd22-4c4b-4366-8d91-8887bc02e8b3/DOCKER.txt)

