FROM openjdk:19-jdk-alpine AS java_build
COPY target/productosapi-0.0.1-SNAPSHOT.jar javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]

FROM nginx:latest AS nginx_conf
COPY ./nginx.conf /etc/nginx/nginx.conf

COPY /root/jenkings/nginx/ssl /ssl/
COPY /root/jenkings/html/ /var/www/html/
COPY /root/jenkings/logs/ /etc/nginx/logs/