# 1. USE EXISTING DOCKER IMAGE AS A BASE
FROM openjdk:8-jdk-alpine


# 2. DOWNLOAD AND INSTALL DEPENDENCIES
# N/A


# 3. SET THE DEPLOYMENT PACKAGE 
# Create Work Directory so as to deploy the project in a directory
WORKDIR /usr/app/inventory-microservice

# Copy the project build package
COPY ./target/inventory-microservice.jar ./


# 4. FINALLY REGISTER THE COMMAND TO RUN WHEN THE CONTAINER STARTS
# ENTRYPOINT ["java", "-jar", "inventory-microservice.jar"]
ENTRYPOINT exec java $JVM_OPTS -jar inventory-microservice.jar
