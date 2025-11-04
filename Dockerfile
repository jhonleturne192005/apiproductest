FROM openjdk:19-jdk-alpine AS java_build
COPY target/productosapi-0.0.1-SNAPSHOT.jar javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]

FROM nginx:latest AS nginx_conf
COPY ./nginx.conf /etc/nginx/nginx.conf

COPY /home/app/nginx/ssl/ /ssl/
COPY /home/app/nginx/html/ /var/www/html/
COPY /home/app/nginx/logs/ /etc/nginx/logs/