FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim


COPY --from=build /target/BookStore-0.0.1-SNAPSHOT.jar BookStore.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","BookStore.jar"]

