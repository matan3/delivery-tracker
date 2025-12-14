# Base image with JDK 21
FROM eclipse-temurin:21-jre

WORKDIR /app

# JAR file
COPY build/libs/delivery-tracker-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run command Free Tier
ENTRYPOINT ["java", "-Xms64m", "-Xmx128m", "-jar", "app.jar"]