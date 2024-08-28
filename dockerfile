FROM eclipse-temurin:21-jdk
WORKDIR /app
CMD [ "mvn","install" ]
ARG JAR_FILE=/app/target/ilovecsv-0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]