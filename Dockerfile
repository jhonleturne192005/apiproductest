FROM FROM eclipse-temurin:19-jdk AS java_build
COPY target/productosapi-0.0.1-SNAPSHOT.jar javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]

FROM nginx:latest AS nginx_conf
WORKDIR /home/app
COPY ./nginx.conf /etc/nginx/nginx.conf