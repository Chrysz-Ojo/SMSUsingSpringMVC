FROM openjdk:17-slim-bullseye
COPY SMSUsingSpringMVC-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
EXPOSE 8080
































#FROM openjdk:17
#LABEL author="Btwice"
#WORKDIR/app
#EXPOSE 8080
#COPY target/SMSUsingSpringMVC-0.0.1-SNAPSHOT.jar app/SMSUsingSpringMVC-0.0.1-SNAPSHOT.jar
#ENTRYPOINT["java","-jar","/app/SMSUsingSpringMVC-0.0.1-SNAPSHOT.jar"]




## Use the official OpenJDK 17 base image
#FROM openjdk:17-slim-bullseye
#
## Copy your Spring Boot JAR file into the container
#COPY SMSUsingSpringMVC-0.0.1-SNAPSHOT.jar /app.jar
#
## Set the working directory
#WORKDIR /
#
## Define the command to run your Spring Boot application
#CMD ["java", "-jar", "/app.jar"]
#
## Expose port 8080 to the outside world (if needed)
EXPOSE 8080
