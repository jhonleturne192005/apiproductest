FROM openjdk:19-jdk-alpine
COPY target/productosapi-0.0.1-SNAPSHOT javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]