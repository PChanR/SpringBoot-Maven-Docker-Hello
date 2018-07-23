FROM openjdk:8-jre-slim

COPY ./target/QuickStartSpringboot-0.0.1-SNAPSHOT.jar /usr/src/QuickStartSpringboot/

WORKDIR /usr/src/QuickStartSpringboot


EXPOSE 8080

CMD ["java", "-jar", "QuickStartSpringboot-0.0.1-SNAPSHOT.jar"]
