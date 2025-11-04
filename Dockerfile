FROM openjdk:19-jdk-alpine
COPY target/productosapi-0.0.1-SNAPSHOT.jar javaapp.jar
ENTRYPOINT ["java","-jar","javaapp.jar"]


from nginx as nginx_conf
COPY ./nginx.conf /etc/nginx/nginx.conf

