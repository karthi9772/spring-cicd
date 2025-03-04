# Use an OpenJDK 21 base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the pre-built JAR file from your local machine to the container
COPY target/spring-learn-0.0.1-SNAPSHOT.jar /app/spring-learn.jar

# Expose the port your app will run on (use 8081 to avoid Jenkins conflict)
EXPOSE 8080

# Run the Java application (with the correct JAR file name)
CMD ["java", "-jar", "/app/spring-learn.jar"]

