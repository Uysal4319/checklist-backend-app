FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/eu-test-0.0.1-SNAPSHOT.jar eu-test-0.0.1-SNAPSHOT.jar
CMD [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/eu-test-0.0.1-SNAPSHOT.jar”]
