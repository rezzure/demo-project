FROM openjdk:17-jdk-slim
ADD target/prabhat-0.0.1-SNAPSHOT.jar spring-boot-kube.jar
ENTRYPOINT ["java", "-jar", "spring-boot-kube.jar"]
