
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/practicaDocker-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9090

CMD [ "java" , "-jar" , "app.jar"]