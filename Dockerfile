# Use an OpenJDK 21 base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Copy your application files into the container
COPY . /app

# Run Maven to build the application (if you want to build it in the container)
RUN mvn clean install

# Expose the port your app will run on
EXPOSE 8080

# Run the Java application (change to your generated JAR file)
CMD ["java", "-jar", "target/your-application.jar"]
