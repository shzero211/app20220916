# m1 이라면 openjdk:17-jdk-alpine 대신 openjdk:17 사용
FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/app20220916-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/app.jar"]
