FROM openjdk:8-jdk-alpine
ADD . /TypesService
WORKDIR /TypesService
CMD ["java", "-jar", "target/hydra-types-service-0.0.1-SNAPSHOT.jar"]