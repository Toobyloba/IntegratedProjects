### **Multi-Tool DevOps Integration Pipeline**

**Introduction:**
This project combines Git, Docker, Jenkins, and shell scripting to create an automated CI/CD pipeline. It demonstrates version control, containerization, and continuous integration practices that are fundamental to modern DevOps workflows.

**Tasks:**
1. Create a Git repository at `/home/student/devops-pipeline`
2. Write a shell script (`deploy.sh`) that builds a Docker image and pushes it to a local registry
3. Create a Dockerfile that packages a simple application
4. Set up a Jenkins pipeline that automatically triggers on Git commits
5. Configure the pipeline to execute the deployment script

**Requirements:**
- Git repository must be initialized with at least one commit
- Shell script must include error handling (`set -e`)
- Dockerfile must use multi-stage builds for optimization
- Jenkins pipeline must use declarative syntax
- Script must log all operations to `/var/log/deploy.log`
- Docker image must be tagged with the Git commit hash
- Pipeline must fail if any step returns a non-zero exit code