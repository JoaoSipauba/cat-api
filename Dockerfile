FROM maven:3.8-openjdk-17 AS build

WORKDIR /home/app
COPY src src
COPY pom.xml .

RUN mvn package spring-boot:repackage -X


FROM openjdk:17 as package
WORKDIR /home/app

COPY --from=build /home/app/target/cat-api-0.0.1-SNAPSHOT.jar cat-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "cat-api.jar"]
