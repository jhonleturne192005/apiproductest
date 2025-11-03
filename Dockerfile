FROM openjdk:19-jdk-alpine
COPY javaproject/apimovil-0.0.1-SNAPSHOT.jar javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]