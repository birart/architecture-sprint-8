FROM gradle:8.10.2-jdk17 AS build
COPY --chown=gradle:gradle .. /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17.0.1
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/backend.jar /app/backend.jar
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" , "-jar", "backend.jar"]