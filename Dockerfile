FROM eclipse-temurin:17
COPY build/libs/finalassignment-0.0.1-SNAPSHOT.jar /usr/src/finalassignment/
WORKDIR /usr/src/finalassignment
CMD ["java", "-jar", "finalassignment-0.0.1-SNAPSHOT.jar"]

