FROM adoptopenjdk:17-jre
COPY build/libs/finalassignment-0.0.1-SNAPSHOT.jar /usr/src/app/
WORKDIR /usr/src/app
CMD ["java", "-jar", "finalassignment-0.0.1-SNAPSHOT.jar"]

