FROM openjdk:8-alpine
ADD target/UserService-0.0.1-SNAPSHOT.jar user-service.jar
ENTRYPOINT ["java", "-jar", "user-service.jar" ]
