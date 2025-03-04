FROM openjdk:21-jdk-slim

WORKDIR /app

COPY . /app

RUN mvn clean install

CMD ["java", "-jar", "SPRING_LEARN.jar"]