FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY target/dz_SpringBootAuthorization-main-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "ap.jar"]
