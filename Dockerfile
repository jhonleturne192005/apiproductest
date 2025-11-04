FROM openjdk:19-jdk-alpine

COPY /home/app/nginx/ nginx/
COPY .nginx.conf nginx/config/nginx.conf

COPY target/productosapi-0.0.1-SNAPSHOT.jar javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]


