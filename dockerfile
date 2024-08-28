FROM eclipse-temurin:21-jdk
ARG JAR_FILE=target/ilovecsv-0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]