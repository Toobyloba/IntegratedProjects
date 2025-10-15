FROM openjdk:17 as builder
WORKDIR /app
COPY . /app
RUN javac WriteToShell.java && \
    echo "Main-Class: WriteToShell" > manifest.txt && \
    jar cfm WriteToShell.jar manifest.txt WriteToShell.class

FROM openjdk:17-jre-slim
WORKDIR /app
COPY --from=builder /app/WriteToShell.jar .
EXPOSE 8080
CMD ["java", "-jar", "WriteToShell.jar"]