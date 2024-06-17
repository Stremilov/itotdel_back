FROM openjdk:17 as builder

WORKDIR /app
COPY . /app/

RUN ./mvnw package

FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/target/itotdel_back-0.0.1-SNAPSHOT.jar /app/itotdel_back-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "itotdel_back-0.0.1-SNAPSHOT.jar"]