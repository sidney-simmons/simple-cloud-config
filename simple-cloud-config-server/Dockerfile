# Jave base image
FROM openjdk:12-alpine

# Maintainer
MAINTAINER Sidney Simmons <sas.simm@gmail.com>

# Make port 8888 open to outside the container
EXPOSE 8888

# The application's jar file
ARG JAR_FILE=build/libs/simple-cloud-config-server-0.0.1.jar

# Add the jar to the container
COPY ${JAR_FILE} simple-cloud-config-server.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/simple-cloud-config-server.jar"]