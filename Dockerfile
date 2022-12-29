#OFFICIAL docker-hub image eclipse-temuriun for Java 11
FROM eclipse-temurin:11
RUN mkdir app

ADD target/calculadora-cambio-*-final.jar ./app/springApp.jar
ADD docker_entrypoint .

EXPOSE ${SERVER_PORT}
ENTRYPOINT ["/bin/sh", "docker_entrypoint"]