#
# Build stage
#
FROM maven:3.6.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean -DskipTests=true package

#
# Package stage
#
FROM openjdk:17
COPY --from=build /home/app/target/coffee-0.0.1-SNAPSHOT.jar /usr/local/lib/bot.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/bot.jar"]