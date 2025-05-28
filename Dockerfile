FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY .mvn .mvn
COPY mvnw mvnw
COPY pom.xml pom.xml

RUN ./mvnw dependency:go-offline

COPY src src
RUN ./mvnw package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/website-0.0.1-SNAPSHOT.jar"]