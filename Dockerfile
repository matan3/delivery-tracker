# Base image with JDK 21
FROM eclipse-temurin:21-jre

# JAR file
COPY build/libs/delivery-tracker-0.0.1-SNAPSHOT.jar app.jar

# Run command Free Tier
ENTRYPOINT ["java", "-Xms64m", "-Xmx128m", "-jar", "/app.jar"]